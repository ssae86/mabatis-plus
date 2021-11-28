package com.cda.template;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.cda.generator.CodeGenerator;

/**
 * @author cdastart
 * @create 2021-11-13 8:34
 */
public class TemplateGenerator {

    public static void main(String[] args) {
        String pkgPath = System.getProperty("user.dir") + "/src/main/java";

        FastAutoGenerator.create(CodeGenerator.URL, "root", "123456")
                //全局配置
                .globalConfig(builder -> {
                    builder.author("cda") // 设置作者
                    .outputDir("pkgPath")// 指定输出目录
                    .fileOverride();    //默认覆盖之前的生成代码
                })
                .packageConfig((scanner,builder) -> builder.parent("com.cda." + scanner.apply("请输入要制定的模块名称：")))
                //模板配置
                .templateConfig(builder -> builder.disable(TemplateType.XML,TemplateType.MAPPER))   //禁用XML、Mapper模板，不生产XML、Mapper
                .strategyConfig((scanner,builder) -> builder.addInclude(scanner.apply("请输入表名：")))
                .execute();
    }

}
