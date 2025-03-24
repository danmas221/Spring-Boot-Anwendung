package com.example.certificatemanager.entities;

import jakarta.persistence.*;

@Entity
public class Devstack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String systemID;
    private String systemuser;
    private String zertifikatsname;
    private String token_gueltigkeit; // Angepasst
    private String cert_gueltigkeit; // Angepasst
    private String tamu_gueltigkeit; // Angepasst
    private String adcs_gueltigkeit; // Angepasst
    @Column(length = 1000)
    private String zweck;
    @Column(length = 1000)
    private String server;

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystemID() {
        return systemID;
    }

    public void setSystemID(String systemID) {
        this.systemID = systemID;
    }

    public String getSystemuser() {
        return systemuser;
    }

    public void setSystemuser(String systemuser) {
        this.systemuser = systemuser;
    }

    public String getZertifikatsname() {
        return zertifikatsname;
    }

    public void setZertifikatsname(String zertifikatsname) {
        this.zertifikatsname = zertifikatsname;
    }

    public String getToken_gueltigkeit() {
        return token_gueltigkeit;
    }

    public void setToken_gueltigkeit(String token_gueltigkeit) {
        this.token_gueltigkeit = token_gueltigkeit;
    }

    public String getCert_gueltigkeit() {
        return cert_gueltigkeit;
    }

    public void setCert_gueltigkeit(String cert_gueltigkeit) {
        this.cert_gueltigkeit = cert_gueltigkeit;
    }

    public String getTamu_gueltigkeit() {
        return tamu_gueltigkeit;
    }

    public void setTamu_gueltigkeit(String tamu_gueltigkeit) {
        this.tamu_gueltigkeit = tamu_gueltigkeit;
    }

    public String getAdcs_gueltigkeit() {
        return adcs_gueltigkeit;
    }

    public void setAdcs_gueltigkeit(String adcs_gueltigkeit) {
        this.adcs_gueltigkeit = adcs_gueltigkeit;
    }

    public String getZweck() {
        return zweck;
    }

    public void setZweck(String zweck) {
        this.zweck = zweck;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}