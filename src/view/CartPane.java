package view;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class CartPane extends GridPane{
	
	public CartPane (){
		//styling
		this.setPadding(new Insets(80, 80, 80, 80));
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);
		
		//create labels
		Label lblTitle = new Label("This is CartPane Tab");
		this.add(lblTitle, 0, 0);
		
		//create items
		int i;
		ArrayList<CartItemPane> cartObjects = new ArrayList<>();
		for (i=0;i<5;i++){
			cartObjects.add(new CartItemPane("ITEM "+i+"   "));
			this.add(cartObjects.get(i),0,i+1);
		}
		
		
		CartItemPane cartList = new CartItemPane();
		CartItemPane testitem = new CartItemPane();
		//this.add(testitem,0,1);
		CartItemPane testitem2 = new CartItemPane();
		//.add(testitem2, 0, 2);
		
	}

}