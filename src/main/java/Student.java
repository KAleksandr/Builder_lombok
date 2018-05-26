/*
Oleksandr Kuzmenko
 */
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Student {
    int id;
    @NonNull
    String firstname;
    @NonNull
    String lastname;
    int age;
    String address;
    String email;
    String phone ;
    String git;

}
