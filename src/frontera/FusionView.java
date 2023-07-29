package frontera;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

import reusableModels.DemonWrapper;
import reusableModels.DemonComboBoxModel.SelectionChangedListener;
import dominio.Demon;
import frontera.FusionModel.FusionModeListener;
import frontera.FusionModel.ResultListener;

public class FusionView extends JPanel{
	private static final long serialVersionUID = -8328503659048875380L;
	
	FusionModel model;
	SelectorPanel selecPan;
	JPanel results;
	
	public FusionView(FusionModel fusModel){
		this.model = fusModel;
		
		this.setLayout(new GridBagLayout());
		final GridBagConstraints c = new GridBagConstraints();
		
		final JPanel fusionOption = new JPanel();
		final JRadioButton familyButton = new JRadioButton();
		familyButton.setAction(this.model.actionFamily);
		familyButton.setSelected(true);
		final JRadioButton demonButton = new JRadioButton();
		demonButton.setAction(this.model.actionDemon);
		final ButtonGroup group = new ButtonGroup();
		group.add(familyButton);
		group.add(demonButton);
		fusionOption.add(familyButton);
		fusionOption.add(demonButton);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(fusionOption, c);
		
		selecPan = new SelectorPanel(this.model.fusionMode.getFusionMode());
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 2, 2, 2);
		c.anchor = GridBagConstraints.NORTHWEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(selecPan,c);
		
		this.model.fusionMode.addFusionModeListener(new FusionModeListener(){
			@Override
			public void fusionModeHasChanged() {
				FusionView.this.remove(selecPan);
				selecPan = new SelectorPanel(FusionView.this.model.fusionMode.getFusionMode());
				c.gridx = 0;
				c.gridy = 1;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.NORTHWEST;
				c.weightx = 0;
				c.weighty = 0;
				FusionView.this.add(selecPan,c);
				FusionView.this.validate();
			}
		});
		
		JButton fuseButton = new JButton();
		fuseButton.setAction(this.model.actionFuse);
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 1;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(2, 10, 2, 2);
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(fuseButton,c);
		
		results = new ResultsPanel();
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		c.gridheight = 1;
		c.fill = GridBagConstraints.NONE;
		c.ipady = 0;
		c.ipadx = 0;
		c.insets = new Insets(12, 2, 2, 2);
		c.anchor = GridBagConstraints.WEST;
		c.weightx = 0;
		c.weighty = 0;
		this.add(results,c);
		
		this.model.result.addResultListener(new ResultListener(){
			@Override
			public void resultHasChanged() {
				FusionView.this.remove(FusionView.this.results);
				FusionView.this.results = new ResultsPanel(model.result.getDemon());
				c.gridx = 0;
				c.gridy = 2;
				c.gridwidth = 2;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(12, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0;
				c.weighty = 0;
				FusionView.this.add(FusionView.this.results,c);
				FusionView.this.validate();
				FusionView.this.repaint();
			}
			
		});
	}
	
	private class SelectorPanel extends JPanel {
		private static final long serialVersionUID = 4850014014040863171L;
		
		JTextField fieldLvl1;
		JTextField fieldLvl2;
		
		public SelectorPanel(int option){
			
			this.setLayout(new GridBagLayout());
			final GridBagConstraints c = new GridBagConstraints();
			
			if (option == FusionModel.FAMILY){
				JComboBox families1 = new JComboBox(FusionView.this.model.typeComboBox1);
				c.gridx = 0;
				c.gridy = 0;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0.1;
				c.weighty = 0;
				this.add(families1,c);
			}
			
			if (option == FusionModel.DEMON){
				JComboBox demons1 = new JComboBox(FusionView.this.model.demonComboBox1);
				c.gridx = 0;
				c.gridy = 0;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0.1;
				c.weighty = 0;
				this.add(demons1,c);
			}
			
			JLabel lblLvl1 = new JLabel("Lvl:");
			c.gridx = 1;
			c.gridy = 0;
			c.gridwidth = 1;
			c.gridheight = 1;
			c.fill = GridBagConstraints.NONE;
			c.ipady = 0;
			c.ipadx = 0;
			c.insets = new Insets(2, 6, 2, 10);
			c.anchor = GridBagConstraints.WEST;
			c.weightx = 0.1;
			c.weighty = 0;
			this.add(lblLvl1,c);
			
			if (option == FusionModel.FAMILY){
				this.fieldLvl1 = new JTextField();
				this.fieldLvl1.setDocument(FusionView.this.model.lvl1);
				try {
					this.fieldLvl1.getDocument().remove(0, this.fieldLvl1.getDocument().getLength());
				} catch (final BadLocationException e) {
					e.printStackTrace();
				}
				c.gridx = 2;
				c.gridy = 0;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.HORIZONTAL;
				c.ipady = 0;
				c.ipadx = 25;
				c.insets = new Insets(2, 2, 2, 0);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 1;
				c.weighty = 0;
				this.add(this.fieldLvl1,c);
					
				JComboBox families2 = new JComboBox(FusionView.this.model.typeComboBox2);
				c.gridx = 0;
				c.gridy = 1;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0.1;
				c.weighty = 0;
				this.add(families2,c);
			}
			
			if (option == FusionModel.DEMON){
				this.fieldLvl1 = new JTextField();
				this.fieldLvl1.setDocument(FusionView.this.model.lvl1);
				try {
					this.fieldLvl1.getDocument().remove(0, this.fieldLvl1.getDocument().getLength());
					this.fieldLvl1.getDocument().insertString(0,Integer.toString(FusionView.this.model.demonComboBox1.getSelectedDemonLevel()),null);
				} catch (final BadLocationException e) {
					e.printStackTrace();
				}
				c.gridx = 2;
				c.gridy = 0;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.HORIZONTAL;
				c.ipady = 0;
				c.ipadx = 25;
				c.insets = new Insets(2, 2, 2, 0);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 1;
				c.weighty = 0;
				this.add(this.fieldLvl1,c);
				
				FusionView.this.model.demonComboBox1.addSelectionChangedListener(new SelectionChangedListener(){
					@Override
					public void selectionHasChanged(){
						
					}
				});
					
				JComboBox demons2 = new JComboBox(FusionView.this.model.demonComboBox2);
				c.gridx = 0;
				c.gridy = 1;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0.1;
				c.weighty = 0;
				this.add(demons2,c);
			}
			
			JLabel lblLvl2 = new JLabel("Lvl:");
			c.gridx = 1;
			c.gridy = 1;
			c.gridwidth = 1;
			c.gridheight = 1;
			c.fill = GridBagConstraints.NONE;
			c.ipady = 0;
			c.ipadx = 0;
			c.insets = new Insets(2, 6, 2, 10);
			c.anchor = GridBagConstraints.WEST;
			c.weightx = 0.1;
			c.weighty = 0;
			this.add(lblLvl2,c);
			
			if (option == FusionModel.FAMILY){
				this.fieldLvl2 = new JTextField();
				this.fieldLvl2.setDocument(FusionView.this.model.lvl2);
				try {
					this.fieldLvl2.getDocument().remove(0, this.fieldLvl2.getDocument().getLength());
				} catch (final BadLocationException e) {
					e.printStackTrace();
				}
				c.gridx = 2;
				c.gridy = 1;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.HORIZONTAL;
				c.ipady = 0;
				c.ipadx = 25;
				c.insets = new Insets(2, 2, 2, 0);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 1;
				c.weighty = 0;
				this.add(this.fieldLvl2,c);
			}
			if (option == FusionModel.DEMON){
				this.fieldLvl2 = new JTextField();
				this.fieldLvl2.setDocument(FusionView.this.model.lvl2);
				try {
					this.fieldLvl2.getDocument().remove(0, this.fieldLvl2.getDocument().getLength());
					this.fieldLvl2.getDocument().insertString(0,Integer.toString(FusionView.this.model.demonComboBox2.getSelectedDemonLevel()),null);
				} catch (final BadLocationException e) {
					e.printStackTrace();
				}
				c.gridx = 2;
				c.gridy = 1;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.HORIZONTAL;
				c.ipady = 0;
				c.ipadx = 25;
				c.insets = new Insets(2, 2, 2, 0);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 1;
				c.weighty = 0;
				this.add(this.fieldLvl2,c);
			}
			
			FusionView.this.model.demonComboBox1.addSelectionChangedListener(new SelectionChangedListener(){
				@Override
				public void selectionHasChanged(){
					try {
						SelectorPanel.this.fieldLvl1.getDocument().remove(0,SelectorPanel.this.fieldLvl1.getDocument().getLength());
						SelectorPanel.this.fieldLvl1.getDocument().insertString(0,Integer.toString(FusionView.this.model.demonComboBox1.getSelectedDemonLevel()),null);
					} catch (final BadLocationException e) {
						e.printStackTrace();
					}
				}
			});
			
			FusionView.this.model.demonComboBox2.addSelectionChangedListener(new SelectionChangedListener(){
				@Override
				public void selectionHasChanged(){
					try {
						SelectorPanel.this.fieldLvl2.getDocument().remove(0,SelectorPanel.this.fieldLvl2.getDocument().getLength());
						SelectorPanel.this.fieldLvl2.getDocument().insertString(0,Integer.toString(FusionView.this.model.demonComboBox2.getSelectedDemonLevel()),null);
					} catch (final BadLocationException e) {
						e.printStackTrace();
					}
				}
			});
			
		}
				
	}
	
	private class ResultsPanel extends JPanel {
		private static final long serialVersionUID = 5815533513552202019L;

		JLabel fusing;
		JLabel name;
		JLabel family;
		JLabel baseLvl;
		JLabel align;
		
		public ResultsPanel(){
			String path = new String("Images/BLANK.png");
			this.setLayout(new GridBagLayout());
			final GridBagConstraints c = new GridBagConstraints();
			c.gridx = 0;
			c.gridy = 1;
			c.gridwidth = 1;
			c.gridheight = 1;
			c.fill = GridBagConstraints.NONE;
			c.ipady = 0;
			c.ipadx = 0;
			c.insets = new Insets(2, 2, 2, 2);
			c.anchor = GridBagConstraints.WEST;
			c.weightx = 0;
			c.weighty = 0;
			this.add(new JLabel(" Result:  "),c);
			name = new JLabel(" ");
			c.gridx = 1;
			c.gridy = 1;
			this.add(name,c);
			c.gridx = 0;
			c.gridy = 2;
			this.add(new JLabel(" Family:  "),c);
			family = new JLabel(" ");
			c.gridx = 1;
			c.gridy = 2;
			this.add(family,c);
			c.gridx = 0;
			c.gridy = 3;
			this.add(new JLabel(" Base level:  "),c);
			baseLvl = new JLabel(" ");
			c.gridx = 1;
			c.gridy = 3;
			this.add(baseLvl,c);
			c.gridx = 0;
			c.gridy = 4;
			this.add(new JLabel(" Alignment:  "),c);
			c.gridx = 1;
			c.gridy = 4;
			this.add(new JLabel(" "),c);
			c.gridx = 0;
			c.gridy = 5;
			c.gridwidth = 1;
			c.gridheight = 1;
			c.fill = GridBagConstraints.NONE;
			c.ipady = 0;
			c.ipadx = 0;
			c.insets = new Insets(2, 2, 2, 2);
			c.anchor = GridBagConstraints.WEST;
			c.weightx = 0;
			c.weighty = 0;
			this.add(new JLabel(" Icon:  "),c);
			c.gridx = 1;
			c.gridy = 5;
			c.gridwidth = 1;
			c.gridheight = 1;
			c.fill = GridBagConstraints.NONE;
			c.ipady = 0;
			c.ipadx = 0;
			c.insets = new Insets(2, 2, 2, 2);
			c.anchor = GridBagConstraints.WEST;
			c.weightx = 0;
			c.weighty = 0;
			this.add(new JLabel(new ImageIcon(path)),c);
		}
		
		public ResultsPanel(Demon result){
			if (result == null){
				String path = new String("Images/BLANK.png");
				this.setLayout(new GridBagLayout());
				final GridBagConstraints c = new GridBagConstraints();
				if (FusionView.this.model.fusionMode.getFusionMode() == FusionModel.DEMON){
					c.gridx = 0;
					c.gridy = 0;
					c.gridwidth = 1;
					c.gridheight = 1;
					c.fill = GridBagConstraints.NONE;
					c.ipady = 0;
					c.ipadx = 0;
					c.insets = new Insets(2, 2, 2, 2);
					c.anchor = GridBagConstraints.WEST;
					c.weightx = 0;
					c.weighty = 0;
					this.add(new JLabel(" Fusing:  "),c);
					fusing = new JLabel(((DemonWrapper)FusionView.this.model.demonComboBox1.getSelectedItem()).getDemon().getType().getName()+" and "+((DemonWrapper)FusionView.this.model.demonComboBox2.getSelectedItem()).getDemon().getType().getName());
					c.gridx = 1;
					c.gridy = 0;
					this.add(fusing,c);
				}
				c.gridx = 0;
				c.gridy = 1;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0;
				c.weighty = 0;
				this.add(new JLabel(" Result:  "),c);
				name = new JLabel("<html><font color=\"#FF0000\">No data<html>");
				c.gridx = 1;
				c.gridy = 1;
				this.add(name,c);
				c.gridx = 0;
				c.gridy = 2;
				this.add(new JLabel(" Family:  "),c);
				family = new JLabel(" ");
				c.gridx = 1;
				c.gridy = 2;
				this.add(family,c);
				c.gridx = 0;
				c.gridy = 3;
				this.add(new JLabel(" Base level:  "),c);
				baseLvl = new JLabel(" ");
				c.gridx = 1;
				c.gridy = 3;
				this.add(baseLvl,c);
				c.gridx = 0;
				c.gridy = 4;
				this.add(new JLabel(" Alignment:  "),c);
				c.gridx = 1;
				c.gridy = 4;
				this.add(new JLabel(" "),c);
				c.gridx = 0;
				c.gridy = 5;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0;
				c.weighty = 0;
				this.add(new JLabel(" Icon:  "),c);
				c.gridx = 1;
				c.gridy = 5;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0;
				c.weighty = 0;
				this.add(new JLabel(new ImageIcon(path)),c);
			}
			else {
				ClassLoader classLoader = FusionView.class.getClassLoader();
				URL url= classLoader.getResource ("Images/"+result.getName()+".png");
//nexis			String url = ("Images/"+result.getName()+".png");
				ImageIcon image = new ImageIcon (url);
				this.setLayout(new GridBagLayout());
				final GridBagConstraints c = new GridBagConstraints();
				if (FusionView.this.model.fusionMode.getFusionMode() == FusionModel.DEMON){
					c.gridx = 0;
					c.gridy = 0;
					c.gridwidth = 1;
					c.gridheight = 1;
					c.fill = GridBagConstraints.NONE;
					c.ipady = 0;
					c.ipadx = 0;
					c.insets = new Insets(2, 2, 2, 2);
					c.anchor = GridBagConstraints.WEST;
					c.weightx = 0;
					c.weighty = 0;
					this.add(new JLabel(" Fusing:  "),c);
					fusing = new JLabel(((DemonWrapper)FusionView.this.model.demonComboBox1.getSelectedItem()).getDemon().getType().getName()+" and "+((DemonWrapper)FusionView.this.model.demonComboBox2.getSelectedItem()).getDemon().getType().getName());
					c.gridx = 1;
					c.gridy = 0;
					this.add(fusing,c);
				}
				c.gridx = 0;
				c.gridy = 1;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0;
				c.weighty = 0;
				this.add(new JLabel(" Result:  "),c);
				name = new JLabel(result.getName());
				c.gridx = 1;
				c.gridy = 1;
				this.add(name,c);
				c.gridx = 0;
				c.gridy = 2;
				this.add(new JLabel(" Family:  "),c);
				family = new JLabel(result.getType().getName());
				c.gridx = 1;
				c.gridy = 2;
				this.add(family,c);
				c.gridx = 0;
				c.gridy = 3;
				this.add(new JLabel(" Base level:  "),c);
				baseLvl = new JLabel(Integer.toString(result.getLevel()));
				c.gridx = 1;
				c.gridy = 3;
				this.add(baseLvl,c);
				c.gridx = 0;
				c.gridy = 4;
				this.add(new JLabel(" Alignment:  "),c);
				align = result.getType().getAlignment().toLabel();
				c.gridx = 1;
				c.gridy = 4;
				this.add(align,c);
				c.gridx = 0;
				c.gridy = 5;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.WEST;
				c.weightx = 0;
				c.weighty = 0;
				this.add(new JLabel(" Icon:  "),c);
				c.gridx = 1;
				c.gridy = 5;
				c.gridwidth = 1;
				c.gridheight = 1;
				c.fill = GridBagConstraints.NONE;
				c.ipady = 0;
				c.ipadx = 0;
				c.insets = new Insets(2, 2, 2, 2);
				c.anchor = GridBagConstraints.NORTHWEST;
				c.weightx = 0;
				c.weighty = 0;
				this.add(new JLabel(image),c);

			}
		}
	}
	
}
