package p2p.service;

import p2p.utils.UploadUtils;

import java.util.HashMap;

public class FileSharer {

    private HashMap<Integer,String> availableFiles;

    public FileSharer (){
        availableFiles = new HashMap<Integer,String>();
    }

    public int offerFile(String filepath){
        int port;
        while(true){
            port  = UploadUtils.generateCode();
            if(!availableFiles.containsKey(port)){
                availableFiles.put(port,filepath);
                return port;
            }
        }
    }
}
