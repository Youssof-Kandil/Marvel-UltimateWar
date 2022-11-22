package controller;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class ChampionButton1 extends StackPane {
	public ChampionButton1(String s) throws Exception {
		Rectangle bg = new Rectangle(100, 150);
		bg.setOpacity(0);
		bg.setFill(Color.BLACK);
		bg.setEffect(new GaussianBlur(3.5));
		
		switch (s) {
		case "Captain America":
			InputStream CaptainP = Files.newInputStream(Paths.get("res/images/CaptainAmerica.png"));
			Image Captain = new Image(CaptainP);
			CaptainP.close();
			ImageView CaptainView = new ImageView(Captain);
			CaptainView.setPreserveRatio(true);
			CaptainView.setSmooth(true);
			CaptainView.setCache(true);
			CaptainView.setFitHeight(150);
			CaptainView.setFitWidth(100);
			
			getChildren().addAll(CaptainView, bg);
			break;
		case "Deadpool":
			InputStream DeadpoolP = Files.newInputStream(Paths.get("res/images/DeadPool.png"));
			Image Deadpool = new Image(DeadpoolP);
			DeadpoolP.close();
			ImageView DeadpoolView = new ImageView(Deadpool);
			DeadpoolView.setPreserveRatio(true);
			DeadpoolView.setSmooth(true);
			DeadpoolView.setCache(true);
			DeadpoolView.setFitHeight(150);
			DeadpoolView.setFitWidth(100);
			getChildren().addAll(DeadpoolView, bg);
			break;
		case "Dr Strange":
			InputStream DrStrangeP = Files.newInputStream(Paths.get("res/images/DrStrange.png"));
			Image DrStrange = new Image(DrStrangeP);
			DrStrangeP.close();
			ImageView DrStrangeView = new ImageView(DrStrange);
			DrStrangeView.setFitHeight(150);
			DrStrangeView.setFitWidth(100);
			getChildren().addAll(DrStrangeView, bg);
			break;
		case "Electro":
			InputStream ElectroP = Files.newInputStream(Paths.get("res/images/Electro.png"));
			Image Electro = new Image(ElectroP);
			ElectroP.close();
			ImageView ElectroView = new ImageView(Electro);
			ElectroView.setFitHeight(150);
			ElectroView.setFitWidth(100);
			getChildren().addAll(ElectroView, bg);
			break;
		case "Ghost Rider":
			InputStream GhostRiderP = Files.newInputStream(Paths.get("res/images/GhostRider.png"));
			Image GhostRider = new Image(GhostRiderP);
			GhostRiderP.close();
			ImageView GhostRiderView = new ImageView(GhostRider);
			GhostRiderView.setFitHeight(150);
			GhostRiderView.setFitWidth(100);
			getChildren().addAll(GhostRiderView, bg);
			break;
		case "Hela":
			InputStream HelaP = Files.newInputStream(Paths.get("res/images/Hela.png"));
			Image Hela = new Image(HelaP);
			HelaP.close();
			ImageView HelaView = new ImageView(Hela);
			HelaView.setFitHeight(150);
			HelaView.setFitWidth(100);
			getChildren().addAll(HelaView, bg);
			break;
		case "Hulk":
			InputStream HulkP = Files.newInputStream(Paths.get("res/images/Hulk.png"));
			Image Hulk = new Image(HulkP);
			HulkP.close();
			ImageView HulkView = new ImageView(Hulk);
			HulkView.setFitHeight(150);
			HulkView.setFitWidth(100);
			getChildren().addAll(HulkView, bg);
			break;
		case "Iceman":
			InputStream IcemanP = Files.newInputStream(Paths.get("res/images/IceMan.png"));
			Image Iceman = new Image(IcemanP);
			IcemanP.close();
			ImageView IcemanView = new ImageView(Iceman);
			IcemanView.setFitHeight(150);
			IcemanView.setFitWidth(100);
			getChildren().addAll(IcemanView, bg);
			break;
		case "Ironman":
			InputStream IronmanP = Files.newInputStream(Paths.get("res/images/IronMan.png"));
			Image Ironman = new Image(IronmanP);
			IronmanP.close();
			ImageView IronmanView = new ImageView(Ironman);
			IronmanView.setFitHeight(150);
			IronmanView.setFitWidth(100);
			getChildren().addAll(IronmanView, bg);
			break;
		case "Loki":
			InputStream LokiP = Files.newInputStream(Paths.get("res/images/Loki.png"));
			Image Loki = new Image(LokiP);
			LokiP.close();
			ImageView LokiView = new ImageView(Loki);
			LokiView.setFitHeight(150);
			LokiView.setFitWidth(100);
			getChildren().addAll(LokiView, bg);
			break;
		case "Quicksilver":
			InputStream QuicksilverP = Files.newInputStream(Paths.get("res/images/QuickSilver.png"));
			Image Quicksilver = new Image(QuicksilverP);
			QuicksilverP.close();
			ImageView QuicksilverView = new ImageView(Quicksilver);
			QuicksilverView.setFitHeight(150);
			QuicksilverView.setFitWidth(100);
			getChildren().addAll(QuicksilverView, bg);
			break;
		case "Spiderman":
			InputStream SpidermanP = Files.newInputStream(Paths.get("res/images/SpiderMan.png"));
			Image Spiderman = new Image(SpidermanP);
			SpidermanP.close();
			ImageView SpidermanView = new ImageView(Spiderman);
			SpidermanView.setFitHeight(150);
			SpidermanView.setFitWidth(100);
			getChildren().addAll(SpidermanView, bg);
			break;
		case "Thor":
			InputStream ThorP = Files.newInputStream(Paths.get("res/images/Thor.png"));
			Image Thor = new Image(ThorP);
			ThorP.close();
			ImageView ThorView = new ImageView(Thor);
			ThorView.setFitHeight(150);
			ThorView.setFitWidth(100);
			getChildren().addAll(ThorView, bg);
			break;
		case "Venom":
			InputStream VenomP = Files.newInputStream(Paths.get("res/images/Venom.png"));
			Image Venom = new Image(VenomP);
			VenomP.close();
			ImageView VenomView = new ImageView(Venom);
			VenomView.setFitHeight(150);
			VenomView.setFitWidth(100);
			getChildren().addAll(VenomView, bg);
			break;
		case "Yellow Jacket":
			InputStream YellowJacketP = Files.newInputStream(Paths.get("res/images/YellowJacket.png"));
			Image YellowJacket = new Image(YellowJacketP);
			YellowJacketP.close();
			ImageView YellowJacketView = new ImageView(YellowJacket);
			YellowJacketView.setFitHeight(150);
			YellowJacketView.setFitWidth(100);
			getChildren().addAll(YellowJacketView, bg);
			break;
		}

		setOnMouseEntered(e -> {
			bg.setFill(Color.GRAY);
			bg.setOpacity(0.6);
		});
		setOnMouseExited(e -> {
			// bg.setTranslateX(0);
			// text.setTranslateX(0);
			bg.setFill(Color.BLACK);
			bg.setOpacity(0);
		});
	}
}
