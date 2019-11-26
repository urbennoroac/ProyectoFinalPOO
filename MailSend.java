/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design;



import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author urbennoroac
 */
public class MailSend {
    public static void sendMail(String recepient){
       
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "elbaboperro@gmail.com";
        String password = "11061996";
        
        Session session = Session.getInstance(properties, new Authenticator(){
        @Override
        protected PasswordAuthentication getPasswordAuthentication(){
            return new PasswordAuthentication(myAccountEmail, password);
        }
        });
        Message message = prepareMessage(session, myAccountEmail, recepient);
        
        try {
            Transport.send(message);
        } catch (MessagingException ex) {
            Logger.getLogger(MailSend.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    
}

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Recuracion de Contraseña");
            message.setText("Si no requiero su password, ignore este mensaje. \n Su password es: " + My_CNX.passwordbd);
            return message;
        } catch (Exception ex) {
            Logger.getLogger(MailSend.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
    
    

