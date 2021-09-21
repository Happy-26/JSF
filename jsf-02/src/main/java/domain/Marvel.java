package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Marvel {
    private Integer year;
    private String actor;
    private String name;
    private String area;

}
