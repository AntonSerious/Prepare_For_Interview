package hometask7.Controllers;

import hometask7.Exceptions.ResourceNotFoundException;
import hometask7.Models.Student;
import hometask7.Services.StudentService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @ApiOperation(value = "return Student by Id",
            notes = "provide an id to get specific Student",
            response = Student.class)
    @GetMapping("/{id}")
    public Student getStudent(@ApiParam(value = "ID value for the student you need to retrieve", required = true)
                                  @PathVariable Long id) {
        //Student student = studentService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product id = " + id + " not found"));
        if(studentService.findById(id).isPresent()){
            return studentService.findById(id).get();
        }else{
            throw new ResponseStatusException(HttpStatus.NO_CONTENT,"Student id =" + id + "is not found" );
        }
    }
    @ApiOperation(value = "create Student",
            notes = "created student is returned as JSON Object",
            response = Student.class)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Student createStudent(@ApiParam(value = "The whole student as Object in JSON. Without ID", required = true)
                              @RequestBody Student student) {
        return studentService.save(student);
    }
    @ApiOperation(value = "update Student",
            notes = "put ID in RequestBody",
            response = Student.class)
    @PutMapping
    public Student updateStudent(@ApiParam(value = "The whole student as Object in JSON. With ID", required = true)
                                 @RequestBody Student student) {
        return studentService.update(student);
    }

    @ApiOperation(value = "delete Student",
            notes = "provide an ID to delete specific Student",
            response = Student.class)

    @DeleteMapping("/{id}")
    public void deleteStudent(@ApiParam(value = "ID value for the student you need to delete", required = true)
                                  @PathVariable Long id) {
        studentService.deleteById(id);
    }


}
