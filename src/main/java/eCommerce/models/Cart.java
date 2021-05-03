package eCommerce.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by ishita.chourasia on 03/05/21.
 */

@Data
@AllArgsConstructor
public class Cart {

    List<Item> itemList;

    int price;

}
