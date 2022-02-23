package Java.TestingFramework.Controller;

import Java.TestingFramework.Exception.ResourceNotFoundException;
import Java.TestingFramework.Entity.Student;
import Java.TestingFramework.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/roster")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
}
