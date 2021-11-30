package mirea.final_lab.ui;

import mirea.final_lab.*;

import javax.swing.*;
import java.awt.*;

public class ApplicationUI extends JFrame {
  private final TableOrdersManager tableOrdersManager;
  private final InternetOrdersManager internetOrdersManager;

  public ApplicationUI() {
    super("Orders Menu");

    this.tableOrdersManager = new TableOrdersManager();
    this.internetOrdersManager = new InternetOrdersManager();

    Container mainContainer = this.getContentPane();

    mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.PAGE_AXIS));

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.initTableOrderMenu(mainContainer);
    this.initInternetOrderMenu(mainContainer);
  }

  private void initTableOrderMenu(Container mainContainer) {
    JLabel addressTitle = new JLabel("Адрес");

    addressTitle.setFont(new Font("Sans Serif", Font.BOLD, 20));
    addressTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(addressTitle);

    /////////////////////////

    JLabel cityTitle = new JLabel("Город");

    cityTitle.setFont(new Font("Sans Serif", Font.PLAIN, 14));
    cityTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    JTextField cityInput = new JTextField();

    cityInput.setMaximumSize(new Dimension(200, cityInput.getPreferredSize().height));
    cityInput.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(cityTitle);
    mainContainer.add(cityInput);

    /////////////////////////

    JLabel zipCodeTitle = new JLabel("Почтовый индекс");

    zipCodeTitle.setFont(new Font("Sans Serif", Font.PLAIN, 14));
    zipCodeTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    JTextField zipCodeInput = new JTextField();

    zipCodeInput.setMaximumSize(new Dimension(200, zipCodeInput.getPreferredSize().height));
    zipCodeInput.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(zipCodeTitle);
    mainContainer.add(zipCodeInput);

    /////////////////////////

    JLabel streetTitle = new JLabel("Улица");

    streetTitle.setFont(new Font("Sans Serif", Font.PLAIN, 14));
    streetTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    JTextField streetInput = new JTextField();

    streetInput.setMaximumSize(new Dimension(200, streetInput.getPreferredSize().height));
    streetInput.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(streetTitle);
    mainContainer.add(streetInput);

    /////////////////////////

    JLabel buildingTitle = new JLabel("Номер дома");

    buildingTitle.setFont(new Font("Sans Serif", Font.PLAIN, 14));
    buildingTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    JTextField buildingInput = new JTextField();

    buildingInput.setMaximumSize(new Dimension(200, buildingInput.getPreferredSize().height));
    buildingInput.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(buildingTitle);
    mainContainer.add(buildingInput);

    /////////////////////////

    JLabel flatTitle = new JLabel("Квартира");

    flatTitle.setFont(new Font("Sans Serif", Font.PLAIN, 14));
    flatTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    JTextField flatInput = new JTextField();

    flatInput.setMaximumSize(new Dimension(200, flatInput.getPreferredSize().height));
    flatInput.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(flatTitle);
    mainContainer.add(flatInput);

    /////////////////////////

    JLabel customerTitle = new JLabel("Покупатель");

    customerTitle.setFont(new Font("Sans Serif", Font.BOLD, 20));
    customerTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(customerTitle);

    /////////////////////////

    JLabel nameTitle = new JLabel("Имя");

    nameTitle.setFont(new Font("Sans Serif", Font.PLAIN, 14));
    nameTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    JTextField nameInput = new JTextField();

    nameInput.setMaximumSize(new Dimension(200, nameInput.getPreferredSize().height));
    nameInput.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(nameTitle);
    mainContainer.add(nameInput);

    /////////////////////////

    JLabel surnameTitle = new JLabel("Фамилия");

    surnameTitle.setFont(new Font("Sans Serif", Font.PLAIN, 14));
    surnameTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    JTextField surnameInput = new JTextField();

    surnameInput.setMaximumSize(new Dimension(200, surnameInput.getPreferredSize().height));
    surnameInput.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(surnameTitle);
    mainContainer.add(surnameInput);

    /////////////////////////

    JLabel ageTitle = new JLabel("Возраст");

    ageTitle.setFont(new Font("Sans Serif", Font.PLAIN, 14));
    ageTitle.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    JTextField ageInput = new JTextField();

    ageInput.setMaximumSize(new Dimension(200, ageInput.getPreferredSize().height));
    ageInput.setAlignmentX(JLabel.LEFT_ALIGNMENT);

    mainContainer.add(ageTitle);
    mainContainer.add(ageInput);

    /////////////////////////

    JCheckBox checkBox = new JCheckBox("Доставка");

    mainContainer.add(checkBox);

    /////////////////////////

    JButton createOrderButton = new JButton("Создать");

    createOrderButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
    createOrderButton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
    createOrderButton.addActionListener(e -> {
      Address address;

      if (checkBox.isSelected()) {
        address = new Address(cityInput.getText(), streetInput.getText(), Integer.parseInt(zipCodeInput.getText()), Integer.parseInt(buildingInput.getText()), Integer.parseInt(flatInput.getText()));
      } else {
        address = Address.EMPTY_ADDRESS;
      }

      Customer customer = new Customer(nameInput.getText(), surnameInput.getText(), Integer.parseInt(ageInput.getText()), address);


    });

    mainContainer.add(createOrderButton);
  }

  private void initInternetOrderMenu(Container mainContainer) {

  }
}
