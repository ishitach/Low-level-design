package eCommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ishita.chourasia on 03/05/21.
 */

@Data
@AllArgsConstructor
public class Account {

    public String userName;

    public String password;

    public String mobileNumber;

    public String emailid;

}
