package com.devil.entity;

import java.io.Serializable;

public class Customer implements Serializable {
    private Integer id;
    private String no;
    private String name;
    private String regin;
    private Integer manager_id;
    private String manager_name;
    private Integer level;
    private String level_label;
    private Integer satisfy;
    private Integer credit;
    private String addr;
    private String zip;
    private String tel;
    private String fax;
    private String website;
    private String licence;
    private String chieftain;
    private Integer bankroll;
    private Integer turnover;
    private String bank;
    private String account;
    private String tax;
    private String national;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegin() {
        return regin;
    }

    public void setRegin(String regin) {
        this.regin = regin;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevel_label() {
        return level_label;
    }

    public void setLevel_label(String level_label) {
        this.level_label = level_label;
    }

    public Integer getSatisfy() {
        return satisfy;
    }

    public void setSatisfy(Integer satisfy) {
        this.satisfy = satisfy;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getChieftain() {
        return chieftain;
    }

    public void setChieftain(String chieftain) {
        this.chieftain = chieftain;
    }

    public Integer getBankroll() {
        return bankroll;
    }

    public void setBankroll(Integer bankroll) {
        this.bankroll = bankroll;
    }

    public Integer getTurnover() {
        return turnover;
    }

    public void setTurnover(Integer turnover) {
        this.turnover = turnover;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Customer(){

    }
    public Customer(Integer id,String no, String name, String regin, Integer manager_id, String manager_name, Integer level,
                    String level_label, Integer satisfy, Integer credit, String addr, String zip, String tel,
                    String fax, String website, String licence, String chieftain, Integer bankroll, Integer turnover,
                    String bank, String account, String tax, String national, Integer status) {
        this.id = id;
        this.no = no;
        this.name = name;
        this.regin = regin;
        this.manager_id = manager_id;
        this.manager_name = manager_name;
        this.level = level;
        this.level_label = level_label;
        this.satisfy = satisfy;
        this.credit = credit;
        this.addr = addr;
        this.zip = zip;
        this.tel = tel;
        this.fax = fax;
        this.website = website;
        this.licence = licence;
        this.chieftain = chieftain;
        this.bankroll = bankroll;
        this.turnover = turnover;
        this.bank = bank;
        this.account = account;
        this.tax = tax;
        this.national = national;
        this.status = status;
    }
}
