package com.company.Methods;

import com.company.JFrames.FirstPage;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Main {

    public static DBManagerInterface dbManager;

    public static void main(MysqlxDatatypes.Scalar.String[] args) {
        dbManager = new DBManager();
    }
}
