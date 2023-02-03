package com.project.gongyeon2jo.components;


import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component //구성요소
public class MailComponents {

    private final JavaMailSender javaMailSender;

    public void sendMailTest() {

        SimpleMailMessage msg = new SimpleMailMessage();

        msg.setTo("mn99108@naver.com");
        msg.setSubject("안녕하세요 바인홀 입니다.");
        msg.setText(" 안녕하세요 테스트중입니다 ");

        javaMailSender.send(msg);
    }

    public boolean sendMail(String mail, String subject, String text ){

        boolean result = false;
        MimeMessagePreparator msg = new MimeMessagePreparator() {
            @Override
            public void prepare(javax.mail.internet.MimeMessage mimeMessage) throws Exception {

                MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

                mimeMessageHelper.setTo(mail);
                mimeMessageHelper.setSubject(subject);
                mimeMessageHelper.setText(text, true);
            }
        };

        try {
            javaMailSender.send(msg);
            result = true;

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return result;

    }

}
