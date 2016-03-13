package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;
import com.vo.Product;

public class Test {

public static Product getProductBYId(int id) throws SQLException {
String selectQuery="select * from producttable where product_id=?";
Connection con=null;
Product product=null;
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","bittu@444");
	PreparedStatement pst=con.prepareStatement(selectQuery);
	pst.setInt(1, id);
	ResultSet rs=pst.executeQuery();
if(rs.next()){
	product =new Product();
	product.setId(rs.getInt("product_id"));
	product.setName(rs.getString("product_name"));
	product.setPrice(rs.getFloat("product_price"));
	product.setDesc(rs.getString("product_desc"));
}	
}catch(Exception e){
	e.printStackTrace();	
	}
return product;


}	

public static List<Product> getProduct() throws SQLException {

String selectQuery="select * from producttable";
Connection con=null;

ArrayList<Product> productlist =new ArrayList<Product>();
try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","bittu@444");
	
	java.sql.Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(selectQuery);
	
	while(rs.next()){
		System.out.println(rs.getInt("product_id"));
		Product product =new Product();
		product.setId(rs.getInt("product_id"));
		product.setName(rs.getString("product_name"));
		product.setPrice(rs.getFloat("product_price"));
		product.setDesc(rs.getString("product_desc"));
		
		productlist.add(product);
		
		/*
		System.out.println(rs.getInt("product_id"));
		System.out.println(rs.getString("product_name"));
		System.out.println(rs.getFloat("product_price"));
		System.out.println(rs.getString("product_desc"));

*/		
	}
}catch(Exception e){
e.printStackTrace();	
}

return productlist;

}
public static void addProduct(Product product) throws SQLException {
	
	
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userlogin","root","bittu@444");
			//***insert*******
			String insertQuery="insert into producttable(product_id,product_name,product_price,product_desc)"
								+ "values(?,?,?,?)";
			//****create table***
			//String createtable="create table producttable(product_id int(22),product_name varchar(33),product_price float(33),product_desc varchar(33))";
			//java.sql.Statement st=con.createStatement();
			//int i=st.executeUpdate(createtable);
			PreparedStatement pst=con.prepareStatement(insertQuery);
			pst.setInt(1, product.getId());
			pst.setString(2, product.getName());
			pst.setDouble(3, product.getPrice());
			pst.setString(4, product.getDesc());
			int i=pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

public static void main(String[] args) throws SQLException {

	Product product =new Product(4,"ipad",20000,"ipad");
	addProduct(product);
	//getProduct();
	System.out.println("==in main==");
	/*List<Product> products=getProduct();
	for(Product product : products)
	{
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getDesc());
		System.out.println("********");
	}	*/
	//getProductBYId
	/*Product product =getProductBYId(2);
	System.out.println(product.getId());
	System.out.println(product.getName());
	System.out.println(product.getPrice());
	System.out.println(product.getDesc());
	*/
}
}