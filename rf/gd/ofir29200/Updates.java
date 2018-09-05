package rf.gd.ofir29200;
String sURL = "https://api.playzcraft.ml/";

URL url = new URL(sURL);
URLConnection request = url.openConnection();
request.connect();

JsonParser jp = new JsonParser();
JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
String zipcode = rootobj.get("zip_code").getAsString(); //just grab the zipcode
public class Updates {

}
