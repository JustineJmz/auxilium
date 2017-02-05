package com.justine.auxilium;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;


public class AuxiliumApplication extends Application {
    void initializeRealm() {
        Realm.Transaction initialData = new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

            }
        };
        Realm.init(getApplicationContext());
        RealmConfiguration realmConfiguration = new RealmConfiguration
                .Builder()
                .initialData(initialData)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initializeRealm();
    }
}
