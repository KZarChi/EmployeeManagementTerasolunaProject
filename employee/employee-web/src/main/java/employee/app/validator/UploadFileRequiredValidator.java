package employee.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

//(2)
public class UploadFileRequiredValidator implements
 ConstraintValidator<UploadFileRequired, MultipartFile> {

 @Override
 public void initialize(UploadFileRequired constraint) {
 }

 @Override
 public boolean isValid(MultipartFile multipartFile,
     ConstraintValidatorContext context) {
     return multipartFile != null &&
         StringUtils.hasLength(multipartFile.getOriginalFilename());
 }

}