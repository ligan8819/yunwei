#禁用CoreFilters
pagespeed RewriteLevel PassThrough;
# 启用压缩空白过滤器    
pagespeed EnableFilters collapse_whitespace;
# 延时加载客户端看不见的图片    
pagespeed EnableFilters lazyload_images;
# 预解析DNS查询    
pagespeed EnableFilters insert_dns_prefetch;
# 启用图片优化机制
pagespeed EnableFilters rewrite_images;
# 把多个CSS文件合并成一个CSS文件
pagespeed EnableFilters combine_css;
# 把多个JavaScript文件合并成一个JavaScript文件
pagespeed EnableFilters combine_javascript;
# 删除带默认属性的标签
pagespeed EnableFilters elide_attributes;
# 改善资源的可缓存性
pagespeed EnableFilters extend_cache;
location ~ "\.pagespeed\.([a-z]\.)?[a-z]{2}\.[^.]{10}\.[^.]+" { add_header "" ""; }  
location ~ "^/ngx_pagespeed_static/" { }  
location ~ "^/ngx_pagespeed_beacon$" { }  
location /ngx_pagespeed_statistics { allow 127.0.0.1; deny all; }  
location /ngx_pagespeed_message { allow 127.0.0.1; deny all; }  


