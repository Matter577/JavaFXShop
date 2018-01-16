package view;

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
import model.Product;
//
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListView;
//
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.SelectionMode;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;

public class MarketPane extends GridPane{
	
	Label customerIDlbl = new Label("---------");
	//TableView table = new TableView();
	protected ListView list = new ListView();
    protected List<String> productList = new ArrayList<>();
    protected ListProperty<String> listProperty = new SimpleListProperty<>();
    private Button btnAddCart = new Button("Add to Cart");




	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public MarketPane (){
		//styling
		this.setPadding(new Insets(80, 80, 80, 80));
		this.setVgap(15);
		this.setHgap(20);
		this.setAlignment(Pos.CENTER);
		
		customerIDlbl.setWrapText(true);
		//create labels
		Label lblTitle = new Label("This is MarketPane Tab");
		this.add(lblTitle, 0, 0);
		this.add(customerIDlbl, 1, 0);
		
		//add to cart button
		this.add(btnAddCart,2,1);
		
		//listView
		list.itemsProperty().bind(listProperty);
		list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		this.add(list,0,1);
		//productList
        listProperty.set(FXCollections.observableArrayList(productList));
		
		
		/* create table
		table.setEditable(true);
		TableColumn itemNameCol = new TableColumn("Item");
		TableColumn itemPriceCol = new TableColumn("Price");
		TableColumn itemRewardsCol = new TableColumn("Reward Points");
		itemRewardsCol.setMinWidth(100);
		table.getColumns().addAll(itemNameCol, itemPriceCol,itemRewardsCol);
		this.add(table, 0, 1);*/
	    

	}
	
	//method to attach the add button handler
	public void addToCartHandler(EventHandler<ActionEvent> handler) {
			btnAddCart.setOnAction(handler);
		}
	
	public String getSelectedItem(){
		return (String) list.getSelectionModel().getSelectedItem();

	}
	
	public void addProductToList (String productinfo){
		productList.add(productinfo);
		listProperty.set(FXCollections.observableArrayList(productList));
	}
	
	public void changeCustomerIDlbl(String idhere){
		customerIDlbl.setText(""+idhere);
	}
	
	public void addProduct(Product pd){
		//I DONT KNOW
	}
}
