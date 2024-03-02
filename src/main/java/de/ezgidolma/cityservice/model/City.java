package de.ezgidolma.cityservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data // otomatik olarak özellikleri getter setterlıyor
@NoArgsConstructor // boş bir constructor oluşturur
@AllArgsConstructor // özelliklerimizin hepsini içine alıp bir constructor oluşturur
public class City {

    @Id
    private String id;
    private Date createDate = new Date();
    private String name;

}
