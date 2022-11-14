import jakarta.xml.ws.Endpoint;
import webService.BanqueService;
//http://localhost:9191/BanqueWS?wsdl

public class ServerJWS {
    public static void main(String[] args) {
        //0.0.0.0: accepter la connexion depuis n'importe quelle adresse locale
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("web service deployé sur http://0.0.0.0:9191 ");
    }
}
