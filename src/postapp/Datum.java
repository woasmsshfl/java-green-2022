package postapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Datum {
    private int id;
    private String title;
    private String content;
    private String created;
    private String updated;

    private User data;
}
