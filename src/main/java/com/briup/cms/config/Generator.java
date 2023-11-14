package com.briup.cms.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;


/**
 * 代码生成器
 */
public class Generator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/230308-cms", "root", "123")
                .globalConfig(builder -> {
                    builder.author("xps") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
//                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\project\\cms\\src\\main\\java"); // 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent("com.briup") // 设置父包名
                            .moduleName("cms") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\project\\cms\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("cms_article") // 设置需要生成的表名
                            .addInclude("cms_category") // 设置需要生成的表名
                            .addInclude("cms_comment") // 设置需要生成的表名
                            .addInclude("cms_log") // 设置需要生成的表名
                            .addInclude("cms_role") // 设置需要生成的表名
                            .addInclude("cms_slideshow") // 设置需要生成的表名
                            .addInclude("cms_subcomment") // 设置需要生成的表名
                            .addInclude("cms_user") // 设置需要生成的表名
                            .addTablePrefix( "cms_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
