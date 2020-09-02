package demo.gmallinterface.pojo;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import java.io.Serializable;

/**
 * @author SugarYe
 * @date 2020年09月02日 16:53
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
