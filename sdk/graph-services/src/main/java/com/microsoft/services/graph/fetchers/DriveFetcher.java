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
import com.microsoft.services.orc.core.Readable;

/**
 * The type  Drive
 .
 */
public class DriveFetcher extends OrcEntityFetcher<Drive,DriveOperations> 
                                     implements Readable<Drive> {

     /**
     * Instantiates a new DriveFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public DriveFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Drive.class, DriveOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DriveFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public DriveFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
     /**
     * Gets items.
     *
     * @return the items
     */
    public OrcCollectionFetcher<Item, ItemFetcher, ItemCollectionOperations> getItems() {
        return new OrcCollectionFetcher<Item, ItemFetcher, ItemCollectionOperations>("items", this, Item.class, ItemCollectionOperations.class);
    }

    /**
     * Gets item.
     *
     * @return the item
     */
    public ItemFetcher getItem(String id){
         return new OrcCollectionFetcher<Item, ItemFetcher, ItemCollectionOperations>("items", this, Item.class, ItemCollectionOperations.class).getById(id);
    }
     /**
     * Gets root.
     *
     * @return the root
     */
    public ItemFetcher getRoot() {
        return new ItemFetcher("root", this);
    }

}
