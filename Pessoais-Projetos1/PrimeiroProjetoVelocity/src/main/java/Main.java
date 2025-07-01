//IMPORT DAS BIBLIOTECAS USADAS (DEPOIS DE IMPORTAR TODO O VELOCITY NA CLASSE POM);
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import java.io.StringWriter;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		//CONFIGURAR VELOCITY;
		Properties propriedades = new Properties(); //PROPRIEDADES;
		propriedades.setProperty("resource.loader", "class");
		propriedades.setProperty("class.resource.loader.class", 
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		
		VelocityEngine engine = new VelocityEngine(propriedades); //VELOCITY ENGINE;
		engine.init();
		
		//CRIAR OBJETO DO PRODUTO;
		Produto produto = new Produto(1, "PlayStation 5", 3000.00);
		
		//CRIAR O CONTEXTO E ANEXAR DADOS;
		VelocityContext context = new VelocityContext(); //PARECIDO COM A EXIBICAO DE UM HASH MAP;
		context.put("produto", produto);
		
		//CARREGAR (CRIAR) TEMPLATE;
		StringWriter writer = new StringWriter();
		engine.mergeTemplate("produto.vm", "UTF-8", context, writer);
		
		//EXIBIR DADOS (RESULTADO);
		System.out.println(writer.toString());
		
	}
}
