package br.com.pi.fatec.report;

import java.io.InputStream;

import java.util.List;

import br.com.pi.fatec.dto.ReportDTO;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class Relatorio {
	public void gerarRelatorio(List<ReportDTO> lista) throws JRException {
		
		InputStream fonte = Relatorio.class.getResourceAsStream("/report/relatorio.jrxml");
		
		JasperReport report = JasperCompileManager.compileReport(fonte);
		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(lista));
		JasperViewer.viewReport(print, false);
	}
	
}
