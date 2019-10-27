package com.huangdeyi.distributed.jms;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

public class SpringJmsSender {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-jms.xml");
        //得到发送模板
        JmsTemplate jmsTemplate =  context.getBean("jmsTemplate", JmsTemplate.class);
        //发送消息
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText("将activeMq整合进spring");
                return textMessage;
            }
        });

    }
}
