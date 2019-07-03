package com.example.danilo.appdebts.dao;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.danilo.appdebts.classes.Category;
import com.example.danilo.appdebts.classes.Debts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aluno on 28/06/19.
 */

public class DebtsDAO {

    private SQLiteDatabase mConnection;
    public DebtsDAO(SQLiteDatabase conection){
        mConnection = conection;
    }

    public void insert(Debts deb){
        ContentValues contentValues = new ContentValues();
        contentValues.put("tipo", deb.getMcod_cat());
        contentValues.put("tipo", deb.getMdescricao());
        contentValues.put("tipo", deb.getMexpirationDate());
        contentValues.put("tipo", deb.getMpaymentDate());
        contentValues.put("tipo", deb.getMvalor());
        mConnection.insertOrThrow("dividas", null, contentValues);
    }

    public void remove(int id){
        String[] params = new String[1];
        params[0] = String.valueOf(id);
        mConnection.delete("dividas", "id = ?", params);

    }

    public void alter(Debts deb){
        ContentValues contentValues = new ContentValues();
        contentValues.put("tipo", deb.getMvalor());
        contentValues.put("tipo", deb.getMpaymentDate());
        contentValues.put("tipo", deb.getMexpirationDate());
        contentValues.put("tipo", deb.getMdescricao());
        contentValues.put("tipo", deb.getMcod_cat());
        String[] params = new String[1];
        params[0] = String.valueOf(deb.getMid());
        mConnection.update("dividas", contentValues, "id = ?", params);
    }

    public List<Debts> listDebts(){
        List<Debts> debts = new ArrayList<Debts>();
        Cursor result = mConnection.rawQuery("Select id, cod_cat, valor, descricao, data_vencimento, data_pagamento from dividas",null);
        if(result.getCount()>0){
            result.moveToFirst();
            do{
                Debts deb = new Debts();
                deb.setMid(result.getInt(result.getColumnIndexOrThrow("id")));
                deb.setMcod_cat(result.getLong(result.getColumnIndexOrThrow("cod_cat")));
                deb.setMvalor(result.getFloat(result.getColumnIndexOrThrow("valor")));
                deb.setMdescricao(result.getString(result.getColumnIndexOrThrow("descricao")));
                deb.setMpaymentDate(result.getString(result.getColumnIndexOrThrow("data_pagamento")));
                deb.setMexpirationDate(result.getString(result.getColumnIndexOrThrow("data_vencimento")));
                debts.add(deb);
                Log.d("DebtsDAO","Listando: "+deb.getMid()+" - "+ deb.getMdescricao());
            }while(result.moveToNext());
            result.close();
        }
        return debts;
    }

    public Debts getDebts(int id){
        Debts deb = new Debts();
        String[] params = new String[1];
        params[0] = String.valueOf(id);
        Cursor result = mConnection.rawQuery("Select * from dividas where id='?'",params);
        if(result.getCount()>0){
            result.moveToFirst();
            deb.setMid(result.getInt(result.getColumnIndexOrThrow("id")));
            deb.setMid(result.getInt(result.getColumnIndexOrThrow("id")));
            deb.setMcod_cat(result.getLong(result.getColumnIndexOrThrow("cod_cat")));
            deb.setMvalor(result.getFloat(result.getColumnIndexOrThrow("valor")));
            deb.setMdescricao(result.getString(result.getColumnIndexOrThrow("descricao")));
            deb.setMpaymentDate(result.getString(result.getColumnIndexOrThrow("data_pagamento")));
            deb.setMexpirationDate(result.getString(result.getColumnIndexOrThrow("data_vencimento")));
            result.close();
            return deb;
        }
        return null;
    }
}
