package eCommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ishita.chourasia on 03/05/21.
 */

@Data
@AllArgsConstructor
public class Item {

    String itemId;

    int quantity;

    int price;

    String seller;

    String itemName;

}
