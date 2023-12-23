package com.example.tacocloud.entity;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class TacoOrder implements Serializable {
    @NotBlank(message = "Поле доставки не должно быть пустым")
    private String deliveryName;
    @NotBlank(message = "Поле не должно быть пустым")
    private String deliveryStreet;
    @NotBlank(message = "Поле не должно быть пустым")
    private String deliverCity;
    @NotBlank(message = "Поле не должно быть пустым")
    private String deliveryState;
    @NotBlank(message = "Поле не должно быть пустым")
    private String deliveryZip;
    @CreditCardNumber(message = "Введите валидные данные карты")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
    message = "формат даты mm/yy")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "Не верный CVV")
    private String ccCVV;
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    private Date placedAt;

    private List<Taco> tacoList = new ArrayList<>();
    public void addTaco(Taco taco){
        this.tacoList.add(taco);
    }
}
