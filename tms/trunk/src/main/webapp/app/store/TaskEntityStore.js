/*
 * File: app/store/TaskEntityStore.js
 *
 * This file was generated by Sencha Architect version 3.0.1.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('FQServiceApp.store.TaskEntityStore', {
    extend: 'Ext.data.Store',

    requires: [
        'FQServiceApp.model.TaskEntity',
        'Ext.data.proxy.Ajax',
        'Ext.data.reader.Json'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            autoLoad: false,
            model: 'FQServiceApp.model.TaskEntity',
            storeId: 'TaskEntityStore',
            pageSize:19,
            proxy: {
                type: 'ajax',
                url: '/task/list.json',
                reader: {
                    type: 'json',
                    root: 'results',
                    totalProperty:'totalCount'
                }
            }
        }, cfg)]);
    }
});