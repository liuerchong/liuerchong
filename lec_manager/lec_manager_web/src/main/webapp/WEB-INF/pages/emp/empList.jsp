<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="lib/layui/css/layui.css">
    <link rel="stylesheet" href="css/scroll-bar.css">
    <link rel="stylesheet" href="css/sub-page.css">
    <link rel="stylesheet" href="//at.alicdn.com/t/font_693759_wytlyqhtdtj1nhfr.css">
    <link rel="stylesheet" href="lib/nprogress/nprogress.css">
</head>
<body>
<div class="ok-body">
    <!--面包屑导航区域-->
    <div class="ok-body-breadcrumb">
            <span class="layui-breadcrumb">
                <a><cite>首页</cite></a>
                <a><cite>常用页面</cite></a>
                <a><cite>用户列表</cite></a>
            </span>
        <a class="layui-btn layui-btn-small" href="javascript:location.replace(location.href);" title="刷新">
            <i class="layui-icon layui-icon-refresh"></i>
        </a>
    </div>
    <!--模糊搜索区域-->
    <div class="layui-row">
        <form class="layui-form layui-col-md12 ok-search">
            <input class="layui-input" placeholder="开始日期" autocomplete="off" id="startTime">
            <input class="layui-input" placeholder="截止日期" autocomplete="off" id="endTime">
            <input class="layui-input" placeholder="请输入用户名" autocomplete="off" name="empQueryVo.name" id="name">
            <button class="layui-btn" data-type="search" lay-submit="" lay-filter="search">
                <i class="layui-icon layui-icon-search"></i>
            </button>
        </form>
    </div>
    <!--工具栏-->
    <okToolbar>
        <button class="layui-btn layui-btn-normal" id="batchEnabled">
            <i class="iconfont icon-shangsheng"></i>批量启用
        </button>
        <button class="layui-btn layui-btn-warm" id="batchDisabled">
            <i class="iconfont icon-web-icon-"></i>批量停用
        </button>
        <button class="layui-btn layui-btn-danger" id="batchDel">
            <i class="layui-icon layui-icon-delete"></i>批量删除
        </button>
        <button class="layui-btn" id="addUser">
            <i class="layui-icon">&#xe61f;</i>添加用户
        </button>
        <span>共有数据：<i id="countNum"></i> 条</span>
    </okToolbar>
    <!--数据表格-->
    <table class="layui-hide" id="tableId" lay-filter="tableFilter"></table>
</div>
<!--js逻辑-->
<script src="lib/layui/layui.js"></script>
<script src="lib/nprogress/nprogress.js"></script>
<script>
    NProgress.start();
    window.onload = function () {
        NProgress.done();
    }
    layui.use(['element', 'table', 'form', 'jquery', 'laydate'], function () {
        var element = layui.element;
        var table = layui.table;
        var form = layui.form;
        var $ = layui.jquery;
        var laydate = layui.laydate;
        var laypage = layui.laypage; //分页;

        laydate.render({
            elem: '#startTime',
            type: "datetime"
        });

        laydate.render({
            elem: '#endTime',
            type: "datetime"
        });

        table.render({
            elem: '#tableId',
            url: 'getEmpList',
            limit: 10,
            limits: [5,10,20],
            page: true,
    		method : 'post',
            cols: [[
                    
                {type: 'checkbox'},
                {field: 'uuid', title: 'ID', width: 80, sort: true},
                {field: 'username', title: '用户名', width: 100},
                {field: 'name', title: '姓名', width: 100},
                {field: 'pwd', title: '密码', width: 100},
                {field: 'status', title: '状态', width: 85, templet: '#statusTpl'},
                /* {field: 'role', title: '角色', width: 100, templet: '#roleTpl'}, 
                templet:function (d) {
                    return formatDateTime(d.validityDate);}
                */
                {field: 'email', title: '邮箱', width: 200},
                {field: 'createdate', title: '创建时间', width: 100},
                {field: 'tele', title: '电话', width: 100},
                /* {field: 'logins', title: '登陆次数', width: 100}, */
                {field: 'address', title: '地址', width: 100},
                {field: 'birthday', title: '生日', width: 100},
                {title: '操作', width: 200, templet: '#operationTpl', align: 'center'}
            ]],
            done: function (res, curr, count) {
                $("#countNum").text(count);
            }
        });
    	var $ = layui.$, active = {
    			search : function() {
    				var name = $('#name');
    				table.reload('tableId', {
    					page : {
    						curr : 1
    					},
    					where : {
    						name : ((name.val()))?name.val():"",
    						page : 1
    					}
    				});
    			}
    	/* ,
    			add : function() {
    				parent.layer.open({
    					type : 2,
    					area : [ '700px', '450px' ],
    					fixed : false, // 不固定
    					maxmin : true,
    					content : '/blog/admin-role/add.html'
    				});
    			} */
    		};
    		$('.layui-btn').on('click', function() {
    			var type = $(this).data('type');
    			//alert(type);
    			active[type] ? active[type].call(this) : '';
    			return false;
    		});
    		//table.init();
       // form.on('submit(search)', function () {
           /*  layer.msg('正在查询，请稍后...');
            return false; */
        	//var type = $(this).data('type');
           // console.info(type);
           //	active.call(this) ; 
        	//var name = $('#name');
        	//console.info(name.val());
        	//table.reload('tableId', {
              //  page: {
              //      curr: 1 //重新从第 1 页开始
              //  },
              //  where: {
               //     name:name.val(),
              //  }
           // });
       // }); 
       /*  var active = {
                reload: function () {
                    var name = $('#name');
                    table.reload('tableId', {
                        page: {
                            curr: 1 //重新从第 1 页开始
                        },
                        where: {
                        	//empQueryVo.name: name.val(),
                        	name: name.val(),
                        }
                    });
                }
                };  */
       /*  $('.demoTable .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        }); */
        table.on('tool(tableFilter)', function (obj) {
            var data = obj.data;
            var layEvent = obj.event;
            if (layEvent === 'edit') {
                layer.open({
                    title: '编辑用户',
                    type: 2,
                    shade: false,
                    maxmin: true,
                    shade: 0.5,
                    area: ['90%', '90%'],
                    content: 'user-edit.html',
                    zIndex: layer.zIndex,
                    end: function () {
                        $(".layui-laypage-btn")[0].click();
                    }
                });
            } else if (layEvent === 'del') {
                layer.confirm("确定要删除吗？", {skin: 'layui-layer-lan', icon: 2, title: '提示', anim: 6}, function () {
                    layer.msg("操作成功！", {icon: 1, time: 1000});
                });
            }
        });

        $("#batchEnabled").click(function () {
            layer.confirm("确定要批量启用吗？", {skin: 'layui-layer-lan', icon: 3, title: '提示', anim: 1}, function () {
                var checkStatus = table.checkStatus('tableId');
                var rows = checkStatus.data.length;
                if (rows > 0) {
                    var idsStr = "";
                    for (var i = 0; i < checkStatus.data.length; i++) {
                        idsStr += checkStatus.data[i].id + ',';
                    }
                    console.log("选择的id-->" + idsStr);
                    layer.msg("操作成功！", {icon: 1, time: 1000}, function () {
                        $(".layui-laypage-btn")[0].click();
                    });
                } else {
                    layer.msg('未选择有效数据', {
                        offset: 't',
                        anim: 6
                    });
                }
            });
        })

        $("#batchDisabled").click(function () {
            layer.confirm("确定要批量停用吗？", {skin: 'layui-layer-lan', icon: 3, title: '提示', anim: 2}, function () {
                var checkStatus = table.checkStatus('tableId');
                var rows = checkStatus.data.length;
                if (rows > 0) {
                    var idsStr = "";
                    for (var i = 0; i < checkStatus.data.length; i++) {
                        idsStr += checkStatus.data[i].id + ',';
                    }
                    console.log("选择的id-->" + idsStr);
                    layer.msg("操作成功！", {icon: 1, time: 1000}, function () {
                        $(".layui-laypage-btn")[0].click();
                    });
                } else {
                    layer.msg('未选择有效数据', {
                        offset: 't',
                        anim: 6
                    });
                }
            });
        })

        $("#batchDel").click(function () {
            layer.confirm("确定要批量删除吗？", {skin: 'layui-layer-lan', icon: 2, title: '提示', anim: 6}, function () {
                var checkStatus = table.checkStatus('tableId');
                var rows = checkStatus.data.length;
                if (rows > 0) {
                    var idsStr = "";
                    for (var i = 0; i < checkStatus.data.length; i++) {
                        idsStr += checkStatus.data[i].id + ',';
                    }
                    console.log("选择的id-->" + idsStr);
                    layer.msg("操作成功！", {icon: 1, time: 1000}, function () {
                        $(".layui-laypage-btn")[0].click();
                    });
                } else {
                    layer.msg('未选择有效数据', {
                        offset: 't',
                        anim: 6
                    });
                }
            });
        })

        $("#addUser").click(function () {
            layer.open({
                title: '添加用户',
                type: 2,
                shade: false,
                maxmin: true,
                shade: 0.5,
                anim: 4,
                area: ['90%', '90%'],
                content: 'user-add.html',
                zIndex: layer.zIndex,
                // skin: 'layui-layer-molv',
                end: function () {
                    $(".layui-laypage-btn")[0].click();
                }
            });
        })
    })
</script>
<!--模板-->
<script type="text/html" id="statusTpl">
    <input type="checkbox" name="status" value="{{d.id}}" lay-skin="switch" lay-text="启用|停用" {{ d.status== 0 ? 'checked' : ''}}>
</script>
<script type="text/html" id="roleTpl">
    {{ d.role == 0 ? '管理员' : '普通用户    '}}
</script>
<script type="text/html" id="operationTpl">
    <a href="javascript:;" title="编辑" lay-event="edit"><i class="layui-icon">&#xe642;</i></a>
    <a href="javascript:;" title="删除" lay-event="del"><i class="layui-icon">&#xe640;</i></a>
</script>
</body>
</html>