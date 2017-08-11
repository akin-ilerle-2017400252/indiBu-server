package com.indibu.indiBuserver.core;

import com.indibu.indiBuserver.data.entity.Coupon;
import com.indibu.indiBuserver.data.entity.Deal;
import com.indibu.indiBuserver.data.entity.User;
import com.indibu.indiBuserver.model.IndibuException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CheckerUtill {

    public void userCheck(User user) {
        if (user == null) {
            throw new IndibuException("Kullanıcı bulunamadı, yeniden giriş yapmayı deneyiniz.", HttpStatus.NOT_FOUND);
        }
    }

    public void couponCheck(Coupon coupon) {
        if (coupon == null) {
            throw new IndibuException("Kupon bulunamadı.", HttpStatus.NOT_FOUND);
        }
    }

    public void dealCheck(Deal deal) {
        if (deal == null) {
            throw new IndibuException("Fırsat bulunamadı.", HttpStatus.NOT_FOUND);
        }
    }

}
