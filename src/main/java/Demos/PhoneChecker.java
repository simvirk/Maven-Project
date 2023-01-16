package Demos;

public class PhoneChecker {
    private String phoneNumber;
    private PhoneTypeEnum phoneTypeEnum;

    public PhoneChecker(String phoneNumber, PhoneTypeEnum phoneTypeEnum) {
        this.phoneNumber = phoneNumber;
        this.phoneTypeEnum = phoneTypeEnum;
    }

    public boolean testPhone(String Phone){
            return Phone.matches("/[0-9]/+/");
        }
    }

