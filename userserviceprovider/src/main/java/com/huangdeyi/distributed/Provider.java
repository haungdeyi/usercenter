package com.huangdeyi.distributed;

import com.huangdeyi.distributed.dao.UsercenterDao;
import com.huangdeyi.distributed.domain.User;
import com.huangdeyi.distributed.userservice.UserService;
import com.huangdeyi.distributed.userservice.UserServiceRequest;
import com.huangdeyi.distributed.userservice.UserServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Service("userservice-provider")
public class Provider implements UserService {

    //注入mapper接口生成的代理对象
    @Autowired
    private UsercenterDao usercenterDao;

    //注入jmsTemplate
    @Autowired
    private JmsTemplate jmsTemplate;

    public UserServiceResponse registered(UserServiceRequest request) {
        return null;
    }

    public UserServiceResponse destory(UserServiceRequest request) {
        return null;
    }

    public UserServiceResponse updated(UserServiceRequest request) {
        return null;
    }

    //用户登录的具体业务逻辑
    public UserServiceResponse login(final UserServiceRequest request) {
        System.out.println(request.getParams() + ":悄悄来过");
        UserServiceResponse response = new UserServiceResponse();
        User user = usercenterDao.getUser(2);
        if(user != null){
            response.setState("666");
            response.setData("hello 呀：" + request.getParams());
            //发送消息，记录用户登录
            if( null != request.getParams()){
                jmsTemplate.send(new MessageCreator() {
                    public Message createMessage(Session session) throws JMSException {
                        TextMessage textMessage = session.createTextMessage(request.getParams()+ "登录了！！！！" + "有可能下单，over！！！");
                        return textMessage;
                    }
                });
            }
        }
        else{
            response.setState("222");
            response.setData("用户不存在");
        }
        return  response;
    }

    public UserServiceResponse logout(UserServiceRequest request) {
        return null;
    }
}
