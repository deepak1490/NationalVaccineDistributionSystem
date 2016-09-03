/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Deepak
 */
public class NetworkDirectory {

    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network addNetwork(String name) {
        Network n = new Network();
        n.setName(name);
        networkList.add(n);
        return n;
    }

    public Network searchNetwork(String keyword) {
        for (Network network : networkList) {
            if (keyword.equals(network.getName())) {
                return network;
            }
        }
        return null;
    }

}
