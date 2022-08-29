with
films_schedule as
(
select
f.Id as Film_Id, f.Film_Name, s.Week_Day, s.Id as Session_Id, s.Session_Start, f.Duration,
time_format(addtime(Session_Start, sec_to_time(Duration * 60)), "%H:%i:%s") as Session_End
FROM films_x_sessions fxs
inner join films f on fxs.Film_Id = f.Id
inner join sessions s on fxs.Session_Id = s.Id
)
select f1.Week_Day, f1.Film_Name, f1.Session_Start, f1.Duration, f2.Film_Name, f2.Session_Start, time_format(subtime(f2.Session_Start, f1.Session_End), "%H:%i") as Break
from films_schedule f1
join films_schedule f2 on
	f2.session_Start > addtime(f1.Session_End,  sec_to_time(30 * 60))
    and f1.Week_Day = f2.Week_Day
    and f1.Session_Id <> f2.Session_Id
order by f1.Week_Day, Break desc
;