//package com.example.velo.Mail;
//
//import jakarta.annotation.Resource;
//import jakarta.ejb.Stateless;
//import jakarta.mail.Message;
//import jakarta.mail.MessagingException;
//import jakarta.mail.Session;
//import jakarta.mail.Transport;
//import jakarta.mail.internet.InternetAddress;
//import jakarta.mail.internet.MimeMessage;
//
//
//
//@Stateless
//public class MailBean {
//
////    @Resource(name = "java:jboss/mail/Default")
//
//    @Resource(name = "mail/gmail")
//    private Session session;
//
////    String to, String subject, String body
//    public void sendEmail() throws MessagingException {
//        Message message = new MimeMessage(session);
//        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("elimanesall6@gmail.com"));
//        message.setSubject("Test Send Mail");
//        message.setText("Body: Je teste");
//
//        Transport.send(message);
//    }
//}
