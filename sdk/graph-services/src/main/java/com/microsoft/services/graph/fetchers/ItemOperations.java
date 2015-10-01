/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import static com.microsoft.services.orc.core.Helpers.*;
import com.microsoft.services.orc.serialization.JsonSerializer;

/**
 * The type ItemOperations.
 */
public class ItemOperations extends OrcOperations {

     /**
      * Instantiates a new ItemOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public ItemOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ItemOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public ItemOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * copy listenable future.
     * @param parentReference the parentReference @param name the name 
     * @return the listenable future
     */         
    public ListenableFuture<Item> copy(ItemReference parentReference, String name) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedparentReference = serializer.serialize(parentReference);
		String serializedname = serializer.serialize(name);
		  
        
        ListenableFuture<String> future = copyRaw(serializedparentReference, serializedname);
        return transformToEntityListenableFuture(future, Item.class, getResolver());
        
    }

     /**
     * copyRaw listenable future.
     * @param parentReference the parentReference @param name the name 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyRaw(String parentReference, String name){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("parentReference", parentReference);
		map.put("name", name);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.copy");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * createLink listenable future.
     * @param type the type 
     * @return the listenable future
     */         
    public ListenableFuture<Permission> createLink(String type) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedtype = serializer.serialize(type);
		  
        
        ListenableFuture<String> future = createLinkRaw(serializedtype);
        return transformToEntityListenableFuture(future, Permission.class, getResolver());
        
    }

     /**
     * createLinkRaw listenable future.
     * @param type the type 
     * @return the listenable future
     */ 
    public ListenableFuture<String> createLinkRaw(String type){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("type", type);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.createLink");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * createSession listenable future.
     * @param path the path @param item the item 
     * @return the listenable future
     */         
    public ListenableFuture<UploadSession> createSession(String path, FileSystemItemInformation item) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedpath = serializer.serialize(path);
		String serializeditem = serializer.serialize(item);
		  
        
        ListenableFuture<String> future = createSessionRaw(serializedpath, serializeditem);
        return transformToEntityListenableFuture(future, UploadSession.class, getResolver());
        
    }

     /**
     * createSessionRaw listenable future.
     * @param path the path @param item the item 
     * @return the listenable future
     */ 
    public ListenableFuture<String> createSessionRaw(String path, String item){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("path", path);
		map.put("item", item);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.createSession");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * uploadContent listenable future.
     * @param contentStream the contentStream 
     * @return the listenable future
     */         
    public ListenableFuture<Integer> uploadContent(byte[] contentStream) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedcontentStream = serializer.serialize(contentStream);
		  
        
        ListenableFuture<String> future = uploadContentRaw(serializedcontentStream);
        return transformToEntityListenableFuture(future, Integer.class, getResolver());
        
    }

     /**
     * uploadContentRaw listenable future.
     * @param contentStream the contentStream 
     * @return the listenable future
     */ 
    public ListenableFuture<String> uploadContentRaw(String contentStream){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("contentStream", contentStream);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.Graph.uploadContent");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
     /**
     * content listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<byte[]> content() { 

        final SettableFuture<byte[]> result = SettableFuture.create();
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.GET);
        
        request.getUrl().appendPathComponent("Microsoft.Graph.content");   
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);   
        
        return transformToByteArrayListenableFuture(future);

        
   }
    
    
    
     /**
     * delta listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<Item> delta() { 

        final SettableFuture<Item> result = SettableFuture.create();
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.GET);
        
        request.getUrl().appendPathComponent("Microsoft.Graph.delta");   
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);   
        
        return transformToEntityListenableFuture(transformToStringListenableFuture(future), Item.class, getResolver());
        
        
   }
    
    
    
     /**
     * search listenable future.
     * @param q the q 
     * @return the listenable future
     */         
    public ListenableFuture<Item> search(String q) { 

        final SettableFuture<Item> result = SettableFuture.create();
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.GET);
        
        request.getUrl().appendPathComponent("Microsoft.Graph.search");   
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);   
        
        return transformToEntityListenableFuture(transformToStringListenableFuture(future), Item.class, getResolver());
        
        
   }
    
}
