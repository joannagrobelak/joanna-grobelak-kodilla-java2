package com.kodilla.good.patterns.challenges.POS.infoService;

import com.kodilla.good.patterns.challenges.POS.infoService.InfoService;
import com.kodilla.good.patterns.challenges.POS.user.User;

public class MailService implements InfoService {

    @Override
    public void inform(User user) {
        System.out.println("sending e-mail...");
    }
}
