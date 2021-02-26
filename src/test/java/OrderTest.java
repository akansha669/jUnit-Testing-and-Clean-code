import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order orderObj;
    OrderTest(){
        orderObj = new Order();
    }
    @Test
    void getPrice(){
        //given
        orderObj.setPrice(55.23);
        //when
        double price = orderObj.getPrice();
        //then
        assertEquals(price, 55.23);
    }

    @Test
    void setPrice(){
        Order returnObj = orderObj.setPrice(26.55);
        assertEquals(returnObj, orderObj);
    }
    @Test
    void getPriceWithTex(){
        //given
        orderObj.setPriceWithTex(55.23);
        //when
        double priceWithTex = orderObj.getPriceWithTex();
        //then
        assertEquals(priceWithTex, 55.23);
    }

    @Test
    void setPriceWithTex(){
        Order returnObj = orderObj.setPriceWithTex(26.55);
        assertEquals(returnObj, orderObj);
    }
    @Test
    void getQuantity(){
        //given
        orderObj.setQuantity(5);
        //when
        int quantity = orderObj.getQuantity(5);
        //then
        assertEquals(quantity, 5);
    }

    @Test
    void setQuantity(){
        Order returnObj = orderObj.setQuantity(2);
        assertEquals(returnObj, orderObj);
    }

    @Test
    void getItemName(){
        //given
        orderObj.setItemName("apple");
        //when
        String itemName = orderObj.getItemName();
        //then
        assertEquals(itemName, "apple");
    }

    @Test
    void setItemName(){
        Order returnObj = orderObj.setItemName("apple");
        assertEquals(returnObj, orderObj);
    }

}