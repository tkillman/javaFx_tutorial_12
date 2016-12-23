package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



/////////// 도형 그리기
public class Main extends Application {
	
	
	@Override
	public void start(Stage stage) {
		try {
			
			///StackPane 과 pane의 차이점은 
			//StackPane은 들어온 node를 중앙에 위치시키고
			//pane은 node를 (0,0)에 위치시킨다.
			//StackPane 은 setAlliment 메소드가 있다.
			//setLayoutX 메소드는 Pane Container에서만 의미가 있다.
			//setLayoutX 메소드는 자신이 속한 Container를 기준으로 움직이게 된다.
			
			
			Rectangle rec = new Rectangle(100,100,Color.BLUE);// 폭 100, 높이 100 , 색깔 파랑
			
			/*rec.setLayoutX(200);*/
			//setLayoutX
			/*rec.setTranslateX(100); // 자신의 위치에서 100만큼 움직인다.
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
