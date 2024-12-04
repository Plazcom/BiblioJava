package model;

public class Model {
    private static Connector maConnexion = new Connector ("localhost", "bibliojava","root", "");

    public static Member  selectWhereMember (String email, String password) {
        String req = "select * from member where email= '"+email+"' and password='"+password+"' ; ";
        Member unMember = null;
        try {
            maConnexion.seConnecter();
            Statement unStat = maConnexion.getMaConnexion().createStatement();
            ResultSet desRes = unStat.executeQuery(req);
            if(desRes.next()) {
                unMember= new Member(
                        desRes.getInt("idmember"),
                        desRes.getString("lastname"),
                        desRes.getString("firstname"),
                        desRes.getString("email"),
                        desRes.getString("password"),
                        desRes.getString("phone"),
                        desRes.getString("status"),
                        desRes.getInt("credit"),
                        desRes.getBoolean("is_admin")
                );
            }
            unStat.close();
            maConnexion.seDeconnecter();
        }
        catch (SQLException exp) {
            System.out.println("Erreur d'execution : "+ req);
        }
        return unMember;
    }
}
