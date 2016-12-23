package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/////////// ���� �׸���
public class Main extends Application {
	
	
	@Override
	public void start(Stage stage) {
		try {
			
			///StackPane �� pane�� �������� 
			//StackPane�� ���� node�� �߾ӿ� ��ġ��Ű��
			//pane�� node�� (0,0)�� ��ġ��Ų��.
			//StackPane �� setAlliment �޼ҵ尡 �ִ�.
			//setLayoutX �޼ҵ�� Pane Container������ �ǹ̰� �ִ�.
			//setLayoutX �޼ҵ�� �ڽ��� ���� Container�� �������� �����̰� �ȴ�.
			
			
			Rectangle rec = new Rectangle(100,100,Color.BLUE);// �� 100, ���� 100 , ���� �Ķ�
			
			/*rec.setLayoutX(200);*/
			//setLayoutX
			/*rec.setTranslateX(100); // �ڽ��� ��ġ���� 100��ŭ �����δ�.
			rec.setTranslateY(100);
			*/
			
			
			/*StackPane pane = new StackPane();*/
			Pane root = new Pane();
			Pane root2 = new Pane();
			
			/*root2.setMinSize(300, 300);
			root2.setMaxSize(300, 300);
			root2.setStyle("-fx-border-color:red;");
			root2.setLayoutX(100);
			root2.setLayoutY(100);
			
			*/
			root2.getChildren().add(rec);
			root.getChildren().add(root2);
			
			
			
			Scene scene = new Scene(root,800,500);
			
			scene.setOnMouseMoved(e->{
				rec.setTranslateX(e.getSceneX());
				rec.setTranslateY(e.getSceneY());
				
			});
			
			stage.setScene(scene);
			stage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
