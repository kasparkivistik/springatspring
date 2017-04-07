package eu.leisurify.website.location;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Location represents particular company, school or other unique place where people can play together.
 */

@Entity
@Data
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

}



