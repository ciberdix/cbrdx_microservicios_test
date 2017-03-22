package com.ciberdix.microservices.services;

import com.ciberdix.microservices.services.discovery.DiscoveryServer;
import com.ciberdix.microservices.services.sp.dominio.SpDominioServer;
import com.ciberdix.microservices.services.sp.negocio.SpNegocioServer;
import com.ciberdix.microservices.services.th.dominio.ThDominioServer;
import com.ciberdix.microservices.services.th.negocio.ThNegocioServer;

public class Main {

    public static void main(String[] args) {

        String serverName = "NO-VALUE";

        switch (args.length) {
            case 2:
                System.setProperty("server.port", args[1]);

            case 1:
                serverName = args[0].toLowerCase();
                break;

            default:
                usage();
                return;
        }

        if (serverName.equals("discovery") || serverName.equals("dis")) {
            DiscoveryServer.main(args);
        } else if (serverName.equals("spdominio") || serverName.equals("spd")) {
            SpDominioServer.main(args);
        } else if (serverName.equals("spnegocio") || serverName.equals("spn")) {
            SpNegocioServer.main(args);
        } else if (serverName.equals("thdominio") || serverName.equals("thd")) {
            ThDominioServer.main(args);
        } else if (serverName.equals("thnegocio") || serverName.equals("thn")) {
            ThNegocioServer.main(args);
        } else {
            System.out.println("Unknown server type: " + serverName);
            usage();
        }
    }

    protected static void usage() {
        System.out.println("Usage: java -jar ... <server-name> [server-port]");
        System.out.println(
                "     where server-name is 'reg', 'registration', " + "'accounts' or 'web' and server-port > 1024");
    }
}
