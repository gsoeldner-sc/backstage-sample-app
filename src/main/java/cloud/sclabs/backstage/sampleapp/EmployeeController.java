package cloud.sclabs.backstage.sampleapp;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {



  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/employees")
  List<String> all() {
    return null;
  }
  // end::get-aggregate-root[]


  /* 
  @PostMapping("/employees")
  Employee newEmployee(@RequestBody Employee newEmployee) {
    return null;;
  }
  */

  // Single item
  
  @GetMapping("/employees/{id}")
  Employee one(@PathVariable Long id) {
    
    return null;
  }

  @PutMapping("/employees/{id}")
  Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
    
    return null;
  }

  @DeleteMapping("/employees/{id}")
  void deleteEmployee(@PathVariable Long id) {
    System.out.println("");
  }
}