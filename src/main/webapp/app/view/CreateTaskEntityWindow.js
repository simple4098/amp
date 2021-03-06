/*
 * File: app/view/CreateTaskEntityWindow.js
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

Ext.define('FQServiceApp.view.CreateTaskEntityWindow', {
    extend: 'Ext.window.Window',

    requires: [
        'Ext.form.Panel',
        'Ext.form.field.ComboBox',
        'Ext.button.Button',
        'Ext.form.field.TextArea'
    ],
    modal:true,
    height: 397,
    width: 429,
    title: '新建任务',

    initComponent: function() {
        var me = this;

        Ext.applyIf(me, {
            items: [
                {
                    xtype: 'form',
                    height: 346,
                    bodyPadding: 10,
                    header: false,
                    title: 'My Form',
                    items: [
                        {
                            xtype: 'hiddenfield',
                            id:"taskInfoId",
                            name:'id'
                        },
                        {
                            xtype: 'textfield',
                            anchor: '100%',
                            fieldLabel: '任务名称',
                            name: 'name',
                            allowBlank: false,
                            blankText: '请输入任务名称'
                        },
                        {
                            xtype: 'combobox',
                            anchor: '100%',
                            fieldLabel: '访问方式',
                            emptyText:"下拉选择访问方式",
                            name: 'type',
                            allowBlank: false,
                            displayField: 'name',
                            store: 'JobTypeStore',
                            editable: false,
                            valueField:"value",
                            queryMode: 'local'
                        },
                        {
                            xtype: 'container',
                            layout: 'column',
                            items: [
                                {
                                    xtype: 'textfield',
                                    id: 'CreateTaskEntityWindowCronExp',
                                    fieldLabel: '克隆表达式',
                                    name: 'cron',
                                    allowBlank: false,
                                    blankText: '请录入克隆表达式'
                                },
                                {
                                    xtype: 'button',
                                    handler: function(button, e) {
                                        var cronMaker=Ext.create("FQServiceApp.view.CronMakerWindow");
                                        cronMaker.show();
                                    },
                                    text: '设置'
                                }
                            ]
                        },
                        {
                            xtype: 'textareafield',
                            anchor: '100%',
                            width: 406,
                            fieldLabel: '描述',
                            name: 'description',
                            allowBlank: false,
                            blankText: '请输入描述信息'
                        },
                        {
                            xtype: 'textfield',
                            fieldLabel: '作者:',
                            name: 'author',
                            allowBlank: false,
                            blankText: '请输入作者'
                        },
                        {
                            xtype: 'textfield',
                            fieldLabel: '平台',
                            allowBlank: false,
                            name: 'app',
                            blankText: '请输入接口提供平台名称'
                        },
                        {
                            xtype: 'textfield',
                            width: 400,
                            fieldLabel: '请求路径',
                            name: 'uri',
                            allowBlank: false,
                            blankText: '请输入完成的请求路径'
                        },
                        {
                            xtype: 'container',
                            height: 34,
                            width: 429,
                            margin:"10px 0 0 0",
                            layout: 'absolute',
                            items: [
                                {
                                    xtype: 'button',
                                    handler: function(button, e) {
                                        var form = this.up('form').getForm();
                                        var window=this.up('window');
                                        var action={
                                            "CREATE":"/task/saveCreate.json",
                                            "UPDATE":"/task/saveEdit.json"
                                        };
                                        var actionKey=Ext.getCmp("taskInfoId").getValue()==""?"CREATE":"UPDATE";
                                        form.submit({
                                            clientValidation: true,
                                            url: action[actionKey],
                                            success: function(form, action) {
                                                Ext.MessageBox.alert('系统提示',action.result.msg,function(){
                                                    var grid=Ext.getCmp("taskGrid");
                                                    grid.getStore().reload();
                                                    grid.getSelectionModel().clearSelections();
                                                    grid.fireEvent("selectionchange",null,grid.getSelectionModel());
                                                    window.close();
                                                });
                                            }
                                        });

                                    },
                                    x: 230,
                                    y: 10,
                                    width: 80,
                                    text: '保存'
                                },
                                {
                                    xtype: 'button',
                                    handler: function(button, e) {
                                        this.up('form').getForm().reset();
                                    },
                                    x: 320,
                                    y: 10,
                                    height: 24,
                                    width: 80,
                                    text: '重置'
                                }
                            ]
                        }
                    ],
                    listeners:{
                        afterlayout:function(com){
                            if(me.record!=null){
                                com.loadRecord(me.record);
                            }

                        }
                    }
                }
            ]
        });

        me.callParent(arguments);

    }

});