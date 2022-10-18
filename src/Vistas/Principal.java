/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Modelo.Articulos;
import Modelo.ArticulosDB;
import Modelo.Cliente;
import Modelo.ClienteDB;
import Modelo.Fabricas;
import Modelo.FabricasDB;
import Modelo.Pedido;
import Modelo.PedidoDB;
import Modelo.Proveedores;
import Modelo.ProveedoresDB;
import Modelo.Usuarios;
import Modelo.UsuariosDB;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Christian
 */
public class Principal extends javax.swing.JFrame {

    Cliente cls = new Cliente();
    ClienteDB clsDB = new ClienteDB();
    Articulos art = new Articulos();
    ArticulosDB artDB = new ArticulosDB();
    Proveedores pro = new Proveedores();
    ProveedoresDB proBD = new ProveedoresDB();
    Fabricas fab = new Fabricas();
    FabricasDB fabDB = new FabricasDB();
    Usuarios usu = new Usuarios();
    UsuariosDB usuDB = new UsuariosDB();
    Pedido ped = new Pedido();
    PedidoDB peDB = new PedidoDB();
    DefaultTableModel modelo = new DefaultTableModel();
    int part;
    double cobrototal = 0.00;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        AutoCompleteDecorator.decorate(CboxArticuloProveedor);
        art.listarproveedor(CboxArticuloProveedor);
        pro.listarfabrica(cbxProveedorfabrica);
    }

    public void listacliente() {
        List<ClienteDB> listclBDs = cls.listarClientes();
        modelo = (DefaultTableModel) tblClientes.getModel();
        Object[] obj = new Object[7];
        for (int i = 0; i < listclBDs.size(); i++) {
            obj[0] = listclBDs.get(i).getNIT();
            obj[1] = listclBDs.get(i).getNombre();
            obj[2] = listclBDs.get(i).getDireccion_envio();
            obj[3] = listclBDs.get(i).getTelefono();
            obj[4] = listclBDs.get(i).getSaldo();
            obj[5] = listclBDs.get(i).getLimite_credito();
            obj[6] = listclBDs.get(i).getDescuento();
            modelo.addRow(obj);
        }
        tblClientes.setModel(modelo);
    }
    public void listaproveedor() {
        List<ProveedoresDB> listprBDs = pro.listarprov();
        modelo = (DefaultTableModel) tblProveedor.getModel();
        Object[] obj = new Object[5];
        for (int i = 0; i < listprBDs.size(); i++) {
            obj[0] = listprBDs.get(i).getNIT();
            obj[1] = listprBDs.get(i).getNombre();
            obj[2] = listprBDs.get(i).getTelefono();
            obj[3] = listprBDs.get(i).getDireccion();
            obj[4] = listprBDs.get(i).getFabrica();
            modelo.addRow(obj);
        }
        tblProveedor.setModel(modelo);
    }

    public void listarticulos() {
        List<ArticulosDB> listartBD = art.listararticulos();
        modelo = (DefaultTableModel) tblArticulos.getModel();
        Object[] obj = new Object[6];
        for (int i = 0; i < listartBD.size(); i++) {
            obj[0] = listartBD.get(i).getCodigo();
            obj[1] = listartBD.get(i).getNombre();
            obj[2] = listartBD.get(i).getProveedor();
            obj[3] = listartBD.get(i).getIngresa();
            obj[4] = listartBD.get(i).getDescripcion();
            obj[5] = listartBD.get(i).getPrecio();
            modelo.addRow(obj);
        }
        tblArticulos.setModel(modelo);
    }
    
    public void listfabricas() {
        List<FabricasDB> listFabBD = fab.listarFabricas();
        modelo = (DefaultTableModel) tblFabricas.getModel();
        Object[] obj = new Object[4];
        for (int i = 0; i < listFabBD.size(); i++) {
            obj[0] = listFabBD.get(i).getCodigo();
            obj[1] = listFabBD.get(i).getNombre();
            obj[2] = listFabBD.get(i).getTelefono();
            obj[3] = listFabBD.get(i).getDireccion();
            modelo.addRow(obj);
        }
        tblArticulos.setModel(modelo);
    }
    
    public void listUsuarios() {
        List<UsuariosDB> listUsuBD = usu.listarUsuarios();
        modelo = (DefaultTableModel) tblUsuario.getModel();
        Object[] obj = new Object[3];
        for (int i = 0; i < listUsuBD.size(); i++) {
            obj[0] = listUsuBD.get(i).getNombre();
            obj[1] = listUsuBD.get(i).getCorreo();
            obj[2] = listUsuBD.get(i).getPassword();
            modelo.addRow(obj);
        }
        tblUsuario.setModel(modelo);
    }

    public void cleantable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoPedido = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnFabricas = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnInformacion = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnArticulos = new javax.swing.JButton();
        lblusuario = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtArticuloCodigo = new javax.swing.JTextField();
        txtArticuloIngresa = new javax.swing.JTextField();
        txtArticuloDescrip = new javax.swing.JTextField();
        btnLimpiarArticulo = new javax.swing.JButton();
        btnGuardarArticulo = new javax.swing.JButton();
        btnActualizarArticulo = new javax.swing.JButton();
        btnEliminarArticulo = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtArticuloNombre = new javax.swing.JTextField();
        CboxArticuloProveedor = new javax.swing.JComboBox<>();
        jButton28 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        txtArticuloPrecio = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblArticulos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidoNuevo = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPedidoStock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPedidoDirCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPedidoCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPedidoNomCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPedidoCodigo = new javax.swing.JTextField();
        txtPedidoNITCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtPedidoNombre = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtPedidoPrecio = new javax.swing.JTextField();
        txtPedidoTelCliente = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnPedidoImprimir = new javax.swing.JButton();
        btnPedidoEliminarArt = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        lblPagoTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtProveedor_NIT = new javax.swing.JTextField();
        txtProveedor_nombre = new javax.swing.JTextField();
        txtProveedor_telefono = new javax.swing.JTextField();
        txtProveedor_direccion = new javax.swing.JTextField();
        btnlimpiarproveedor = new javax.swing.JButton();
        btnguardarproveedor = new javax.swing.JButton();
        btnactualizarproveedor = new javax.swing.JButton();
        btneliminarproveedor = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        cbxProveedorfabrica = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProveedor = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnClienteEliminar = new javax.swing.JButton();
        btnClienteActualizar = new javax.swing.JButton();
        btnClienteGuardar = new javax.swing.JButton();
        btnClientelimpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtClienteNIT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtClienteDireccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtClienteSaldo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtClienteCredito = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtClienteDescuento = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtClienteTelefono = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtClienteNombre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblFabricas = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtFabricaCodigo = new javax.swing.JTextField();
        txtFabricaNombre = new javax.swing.JTextField();
        txtFabricaTelefono = new javax.swing.JTextField();
        txtFabricaDireccion = new javax.swing.JTextField();
        btnFabricaLimpiar = new javax.swing.JButton();
        btnFabricaGuardar = new javax.swing.JButton();
        btnFabricaActualizar = new javax.swing.JButton();
        btnFabricaEliminar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        txtUsuarioNombre = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtUsuarioCorreo = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        btnUsuarioLimpiar = new javax.swing.JButton();
        btnUsuarioActualizar = new javax.swing.JButton();
        btnUsuarioGuardar = new javax.swing.JButton();
        btnUsuarioEliminar = new javax.swing.JButton();
        PFUsuarioPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PUNTO DE VENTA");

        btnNuevoPedido.setText("Nuevo Pedido");
        btnNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPedidoActionPerformed(evt);
            }
        });

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProveedor.setText("Proveedor");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnFabricas.setText("Fabricas");
        btnFabricas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabricasActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedor.png"))); // NOI18N

        btnInformacion.setText("Informacion");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnArticulos.setText("Articulos");
        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });

        lblusuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblusuario.setForeground(new java.awt.Color(0, 0, 0));
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnFabricas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFabricas)
                                    .addComponent(btnInformacion)
                                    .addComponent(btnArticulos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPedidos)
                                        .addComponent(btnNuevoPedido)
                                        .addComponent(btnClientes))
                                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));

        jPanel12.setBackground(new java.awt.Color(255, 153, 102));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Codigo Articulo");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Proveedor");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Ingresa");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Descripción");

        btnLimpiarArticulo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLimpiarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagina-web.png"))); // NOI18N
        btnLimpiarArticulo.setText("Limpiar");
        btnLimpiarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarArticuloActionPerformed(evt);
            }
        });

        btnGuardarArticulo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salvar.png"))); // NOI18N
        btnGuardarArticulo.setText("Guardar");
        btnGuardarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArticuloActionPerformed(evt);
            }
        });

        btnActualizarArticulo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnActualizarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizarArticulo.setText("Actualizar");
        btnActualizarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarArticuloActionPerformed(evt);
            }
        });

        btnEliminarArticulo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarArticulo.setText("Eliminar");
        btnEliminarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarArticuloActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Nombre");

        txtArticuloNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        CboxArticuloProveedor.setEditable(true);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/excel.png"))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Precio");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtArticuloCodigo)
                    .addComponent(jLabel40)
                    .addComponent(txtArticuloPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtArticuloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(CboxArticuloProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArticuloIngresa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArticuloDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btnLimpiarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarArticulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarArticulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarArticulo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtArticuloCodigo)
                    .addComponent(txtArticuloDescrip)
                    .addComponent(txtArticuloIngresa)
                    .addComponent(txtArticuloNombre)
                    .addComponent(CboxArticuloProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLimpiarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardarArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarArticulo)
                                .addComponent(btnEliminarArticulo))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jButton28)
                                .addContainerGap(2, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArticuloPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        tblArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Articulo", "Nombre", "Distribuidor", "Existencia", "Descripción", "Precio"
            }
        ));
        tblArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArticulosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblArticulos);
        if (tblArticulos.getColumnModel().getColumnCount() > 0) {
            tblArticulos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblArticulos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblArticulos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblArticulos.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblArticulos.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblArticulos.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel6);

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        tblPedidoNuevo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo articulo", "Nombre articulo", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tblPedidoNuevo);
        if (tblPedidoNuevo.getColumnModel().getColumnCount() > 0) {
            tblPedidoNuevo.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblPedidoNuevo.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblPedidoNuevo.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblPedidoNuevo.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        jPanel9.setBackground(new java.awt.Color(51, 204, 255));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Stock");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dirección envio");

        txtPedidoCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPedidoCantidadKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad");

        txtPedidoNomCliente.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre");

        txtPedidoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPedidoCodigoKeyPressed(evt);
            }
        });

        txtPedidoNITCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPedidoNITClienteKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Codigo cliente");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo articulo");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Nombre articulo");

        txtPedidoNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Precio");

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Telefono");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtPedidoNITCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPedidoCodigo))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPedidoNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPedidoDirCliente)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(txtPedidoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPedidoStock)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPedidoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPedidoCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(txtPedidoTelCliente))
                            .addComponent(jLabel46))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPedidoNITCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPedidoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPedidoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPedidoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPedidoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPedidoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel46)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPedidoNomCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(txtPedidoDirCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPedidoTelCliente)
                            .addComponent(jTextField10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel41)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel10.setBackground(new java.awt.Color(102, 204, 255));

        btnPedidoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/printer.png"))); // NOI18N
        btnPedidoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoImprimirActionPerformed(evt);
            }
        });

        btnPedidoEliminarArt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btnPedidoEliminarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoEliminarArtActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Eliminar articulo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnPedidoEliminarArt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(207, 207, 207)
                .addComponent(btnPedidoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnPedidoEliminarArt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45))
                    .addComponent(btnPedidoImprimir))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(102, 204, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pago Total");

        jPanel20.setBackground(new java.awt.Color(0, 153, 153));

        lblPagoTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblPagoTotal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblPagoTotal.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPagoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPagoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Q");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("NIT proveedor");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Nombre");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Telefono");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Dirección");

        txtProveedor_NIT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        txtProveedor_nombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        txtProveedor_telefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        txtProveedor_direccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btnlimpiarproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagina-web.png"))); // NOI18N
        btnlimpiarproveedor.setText("Limpiar");
        btnlimpiarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarproveedorActionPerformed(evt);
            }
        });

        btnguardarproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salvar.png"))); // NOI18N
        btnguardarproveedor.setText("Guardar");
        btnguardarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarproveedorActionPerformed(evt);
            }
        });

        btnactualizarproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnactualizarproveedor.setText("Actualizar");
        btnactualizarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarproveedorActionPerformed(evt);
            }
        });

        btneliminarproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btneliminarproveedor.setText("Eliminar");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Fabrica");

        cbxProveedorfabrica.setEditable(true);
        cbxProveedorfabrica.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxProveedorfabrica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(93, 93, 93)))
                        .addComponent(btnlimpiarproveedor)
                        .addGap(18, 18, 18)
                        .addComponent(btnguardarproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizarproveedor)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminarproveedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtProveedor_NIT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(txtProveedor_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProveedor_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(txtProveedor_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProveedor_NIT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProveedor_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnlimpiarproveedor)
                                .addComponent(btnguardarproveedor)
                                .addComponent(btnactualizarproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btneliminarproveedor))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxProveedorfabrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tblProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIT", "Nombre", "Teléfono", "Fabrica", "Dirección"
            }
        ));
        tblProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProveedor);
        if (tblProveedor.getColumnModel().getColumnCount() > 0) {
            tblProveedor.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblProveedor.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblProveedor.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblProveedor.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblProveedor.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));

        jPanel11.setBackground(new java.awt.Color(51, 255, 204));

        btnClienteEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnClienteEliminar.setText("Eliminar");
        btnClienteEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteEliminarActionPerformed(evt);
            }
        });

        btnClienteActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnClienteActualizar.setText("Actualizar");
        btnClienteActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActualizarActionPerformed(evt);
            }
        });

        btnClienteGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salvar.png"))); // NOI18N
        btnClienteGuardar.setText("Guardar");
        btnClienteGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClienteGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteGuardarActionPerformed(evt);
            }
        });

        btnClientelimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagina-web.png"))); // NOI18N
        btnClientelimpiar.setText("Limpiar");
        btnClientelimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientelimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientelimpiarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("NIT cliente");

        txtClienteNIT.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Direccion de envio");

        txtClienteDireccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Saldo");

        txtClienteSaldo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Limite de credito");

        txtClienteCredito.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Descuento");

        txtClienteDescuento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Telefono");

        txtClienteTelefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Nombre cliente");

        txtClienteNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtClienteCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClientelimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnClienteEliminar))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtClienteNIT, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                                        .addComponent(txtClienteDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtClienteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(jLabel39)
                                                .addGap(99, 99, 99)
                                                .addComponent(jLabel12)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClienteSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtClienteTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel16)
                                        .addGap(39, 39, 39)))
                                .addGap(88, 88, 88)))))
                .addGap(30, 30, 30))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel39))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClienteNIT)
                            .addComponent(txtClienteDireccion)
                            .addComponent(txtClienteNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClientelimpiar)
                            .addComponent(btnClienteGuardar)
                            .addComponent(btnClienteActualizar)
                            .addComponent(btnClienteEliminar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClienteDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(txtClienteCredito))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DPI cliente", "Nombre cliente", "Direccion envio", "Telefono", "Saldo", "Limite Credito", "Descuento"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(60);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(60);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(20);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(20);
            tblClientes.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab4", jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 204, 153));

        tblFabricas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Fabrica", "Nombre Fabrica", "Telefono", "Direcion"
            }
        ));
        tblFabricas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFabricasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblFabricas);
        if (tblFabricas.getColumnModel().getColumnCount() > 0) {
            tblFabricas.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblFabricas.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblFabricas.getColumnModel().getColumn(2).setPreferredWidth(30);
            tblFabricas.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jPanel13.setBackground(new java.awt.Color(102, 204, 255));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Codigo Fabrica");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Nombre ");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Telefono");

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Direccion");

        txtFabricaCodigo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        txtFabricaNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        txtFabricaTelefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        txtFabricaDireccion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        btnFabricaLimpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnFabricaLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagina-web.png"))); // NOI18N
        btnFabricaLimpiar.setText("Limpiar");
        btnFabricaLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabricaLimpiarActionPerformed(evt);
            }
        });

        btnFabricaGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnFabricaGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salvar.png"))); // NOI18N
        btnFabricaGuardar.setText("Guardar");
        btnFabricaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabricaGuardarActionPerformed(evt);
            }
        });

        btnFabricaActualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnFabricaActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnFabricaActualizar.setText("Actualizar");
        btnFabricaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabricaActualizarActionPerformed(evt);
            }
        });

        btnFabricaEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnFabricaEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnFabricaEliminar.setText("Eliminar");
        btnFabricaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabricaEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(txtFabricaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(txtFabricaTelefono))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFabricaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFabricaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFabricaLimpiar)
                    .addComponent(btnFabricaActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFabricaGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFabricaEliminar))
                .addGap(44, 44, 44))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFabricaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtFabricaNombre)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFabricaLimpiar)
                            .addComponent(btnFabricaGuardar))))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFabricaActualizar)
                            .addComponent(btnFabricaEliminar))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFabricaTelefono)
                            .addComponent(txtFabricaDireccion))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab5", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 204, 153));

        jPanel15.setBackground(new java.awt.Color(0, 153, 102));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(722, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addComponent(jButton26)
                .addContainerGap())
        );

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cliente", "fecha pedido", "Cantidad", "Fabrica", "Telefono", "Total"
            }
        ));
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable6.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable6.getColumnModel().getColumn(2).setPreferredWidth(20);
            jTable6.getColumnModel().getColumn(3).setPreferredWidth(20);
            jTable6.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable6.getColumnModel().getColumn(5).setPreferredWidth(20);
            jTable6.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab6", jPanel8);

        jPanel14.setBackground(new java.awt.Color(255, 204, 153));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel32.setText("NIT");

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel33.setText("NOMBRE");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel34.setText("TELEFONO");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel35.setText("DIRECCION");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel31.setText("DATOS DE LA EMPRESA");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel36.setText("CORREO");

        jTextField19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jTextField20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jTextField21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jTextField22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jTextField23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jButton27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        jButton27.setText("ACTUALIZAR");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(281, 281, 281))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField19)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(53, 53, 53)))
                                .addGap(170, 170, 170)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField20)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(92, 92, 92)))
                                .addGap(157, 157, 157)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(63, 63, 63))
                                    .addComponent(jTextField21)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(147, 147, 147))
                                    .addComponent(jTextField22))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(156, 156, 156))
                                    .addComponent(jTextField23))
                                .addGap(217, 217, 217)))))
                .addGap(42, 42, 42))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(296, 296, 296))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel31)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(47, 47, 47)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton27)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab7", jPanel14);

        jPanel17.setBackground(new java.awt.Color(255, 204, 153));

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Correo", "Contraseña"
            }
        ));
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblUsuario);
        if (tblUsuario.getColumnModel().getColumnCount() > 0) {
            tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblUsuario.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblUsuario.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        jPanel18.setBackground(new java.awt.Color(0, 153, 153));

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Nombre Usuario");

        txtUsuarioNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Correo");

        txtUsuarioCorreo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Contraseña");

        btnUsuarioLimpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUsuarioLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pagina-web.png"))); // NOI18N
        btnUsuarioLimpiar.setText("Limpiar");
        btnUsuarioLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioLimpiarActionPerformed(evt);
            }
        });

        btnUsuarioActualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUsuarioActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnUsuarioActualizar.setText("Actualizar");
        btnUsuarioActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActualizarActionPerformed(evt);
            }
        });

        btnUsuarioGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUsuarioGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salvar.png"))); // NOI18N
        btnUsuarioGuardar.setText("Guardar");
        btnUsuarioGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioGuardarActionPerformed(evt);
            }
        });

        btnUsuarioEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUsuarioEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnUsuarioEliminar.setText("Eliminar");
        btnUsuarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(txtUsuarioCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(PFUsuarioPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtUsuarioNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUsuarioActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarioLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUsuarioGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarioEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuarioGuardar)
                            .addComponent(btnUsuarioLimpiar))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUsuarioActualizar)
                        .addComponent(btnUsuarioEliminar))
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuarioCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PFUsuarioPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab8", jPanel17);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientelimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientelimpiarActionPerformed
        // TODO add your handling code here:
        cleanclientes();
    }//GEN-LAST:event_btnClientelimpiarActionPerformed

    private void btnguardarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarproveedorActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtProveedor_NIT.getText()) || !"".equals(txtProveedor_nombre.getText()) || !"".equals(txtProveedor_telefono.getText()) || !"".equals(txtProveedor_direccion.getText()) || !"".equals(cbxProveedorfabrica.getSelectedItem())) {
            proBD.setNIT(Integer.parseInt(txtProveedor_NIT.getText()));
            proBD.setNombre(txtProveedor_nombre.getText());
            proBD.setTelefono(Integer.parseInt(txtProveedor_telefono.getText()));
            proBD.setDireccion(txtProveedor_direccion.getText());
            proBD.setFabrica(cbxProveedorfabrica.getSelectedItem().toString());
            pro.RegistroProv(proBD);
            cleantable();
            cleanProveedor();
            listaproveedor();
            JOptionPane.showMessageDialog(null, "proveedor registrado con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        }
    }//GEN-LAST:event_btnguardarproveedorActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        // TODO add your handling code here:
        cleantable();
        listaproveedor();
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnGuardarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArticuloActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtArticuloCodigo.getText()) || !"".equals(txtArticuloNombre.getText()) || !"".equals(CboxArticuloProveedor.getSelectedItem()) || !"".equals(txtArticuloIngresa.getText()) || !"".equals(txtArticuloDescrip.getText()) || !"".equals(txtArticuloPrecio.getText())) {
            artDB.setCodigo(txtArticuloCodigo.getText());
            artDB.setNombre(txtArticuloNombre.getText());
            artDB.setProveedor(CboxArticuloProveedor.getSelectedItem().toString());
            artDB.setIngresa(Integer.parseInt(txtArticuloIngresa.getText()));
            artDB.setDescripcion(txtArticuloDescrip.getText());
            artDB.setPrecio(Double.parseDouble(txtArticuloPrecio.getText()));
            art.registroarticulos(artDB);
            JOptionPane.showMessageDialog(null, "articulo registrado con exito");
        } else {
            JOptionPane.showMessageDialog(null, "llene todos los campos");
        }
    }//GEN-LAST:event_btnGuardarArticuloActionPerformed

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed
        // TODO add your handling code here:
        cleantable();
        listarticulos();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnArticulosActionPerformed

    private void tblArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArticulosMouseClicked
        // TODO add your handling code here:
        int fila = tblArticulos.rowAtPoint(evt.getPoint());
        txtArticuloCodigo.setText(tblArticulos.getValueAt(fila, 0).toString());
        txtArticuloNombre.setText(tblArticulos.getValueAt(fila, 1).toString());
        CboxArticuloProveedor.setSelectedItem(tblArticulos.getValueAt(fila, 2));
        txtArticuloIngresa.setText(tblArticulos.getValueAt(fila, 3).toString());
        txtArticuloDescrip.setText(tblArticulos.getValueAt(fila, 4).toString());
        txtArticuloPrecio.setText(tblArticulos.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_tblArticulosMouseClicked

    private void btnEliminarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarArticuloActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtArticuloCodigo.getText())) {
            int question = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el producto");
            if (question == 0) {
                String codigo = txtArticuloCodigo.getText();
                art.deletarticulo(codigo);
                cleantable();
                cleanArticulos();
                listarticulos();
            }
        }
    }//GEN-LAST:event_btnEliminarArticuloActionPerformed

    private void btnActualizarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarArticuloActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtArticuloCodigo.getText())) {
            JOptionPane.showConfirmDialog(null, "Seleccione un articulo");
        } else {
            if (!"".equals(txtArticuloCodigo.getText()) || !"".equals(txtArticuloNombre.getText()) || !"".equals(CboxArticuloProveedor.getSelectedItem()) || !"".equals(txtArticuloIngresa.getText()) || !"".equals(txtArticuloDescrip.getText()) || !"".equals(txtArticuloPrecio.getText()) || !"".equals(txtArticuloCodigo.getText())) {
                artDB.setCodigo(txtArticuloCodigo.getText());
                artDB.setNombre(txtArticuloNombre.getText());
                artDB.setProveedor(CboxArticuloProveedor.getSelectedItem().toString());
                artDB.setIngresa(Integer.parseInt(txtArticuloIngresa.getText()));
                artDB.setDescripcion(txtArticuloDescrip.getText());
                artDB.setPrecio(Double.parseDouble(txtArticuloPrecio.getText()));
                artDB.setCodigo(txtArticuloCodigo.getText());
                art.actualizararticulo(artDB);
                cleantable();
                cleanArticulos();
                listarticulos();
                JOptionPane.showMessageDialog(null, "articulo actualizado con exito");                
            }
        }
    }//GEN-LAST:event_btnActualizarArticuloActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        cleantable();
        listacliente();
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // TODO add your handling code here:
        int fila = tblClientes.rowAtPoint(evt.getPoint());
        txtClienteNIT.setText(tblClientes.getValueAt(fila, 0).toString());
        txtClienteNombre.setText(tblClientes.getValueAt(fila, 1).toString());
        txtClienteDireccion.setText(tblClientes.getValueAt(fila, 2).toString());
        txtClienteTelefono.setText(tblClientes.getValueAt(fila, 3).toString());
        txtClienteSaldo.setText(tblClientes.getValueAt(fila, 4).toString());
        txtClienteCredito.setText(tblClientes.getValueAt(fila, 5).toString());
        txtClienteDescuento.setText(tblClientes.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnClienteEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteEliminarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtClienteNIT.getText())) {
            int question = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar al cliente");
            if (question == 0) {
                String DPI = (txtClienteNIT.getText());
                cls.deletcliente(DPI);
                cleantable();
                cleanclientes();
                listacliente();
            }
        }
    }//GEN-LAST:event_btnClienteEliminarActionPerformed

    private void btnClienteGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteGuardarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtClienteNIT.getText()) || !"".equals(txtClienteNombre.getText()) || !"".equals(txtClienteDireccion.getText()) || !"".equals(txtClienteTelefono.getText()) || !"".equals(txtClienteCredito.getText()) || !"".equals(txtClienteDescuento.getText())) {
            clsDB.setNIT(txtClienteNIT.getText());
            clsDB.setNombre(txtClienteNombre.getText());
            clsDB.setDireccion_envio(txtClienteDireccion.getText());
            clsDB.setTelefono(Integer.parseInt(txtClienteTelefono.getText()));
            clsDB.setSaldo(Double.parseDouble(txtClienteSaldo.getText()));
            clsDB.setLimite_credito(Integer.parseInt(txtClienteCredito.getText()));
            clsDB.setDescuento(Double.parseDouble(txtClienteDescuento.getText()));
            cls.registroclientes(clsDB);
            cleantable();
            listacliente();
            JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "llene los campos vacios");
        }
    }//GEN-LAST:event_btnClienteGuardarActionPerformed

    private void btnClienteActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActualizarActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtClienteNIT.getText())) {
            JOptionPane.showConfirmDialog(null, "Tiene campos vacios");
        } else {
            if (!"".equals(txtClienteNombre.getText()) || !"".equals(txtClienteNombre.getText()) || !"".equals(txtClienteDireccion.getText()) || !"".equals(txtClienteTelefono.getText()) || !"".equals(txtClienteSaldo.getText()) || !"".equals(txtClienteCredito.getText()) || !"".equals(txtClienteDescuento.getText()) || !"".equals(txtClienteNombre.getText())) {
                clsDB.setNombre(txtClienteNombre.getText());
                clsDB.setDireccion_envio(txtClienteDireccion.getText());
                clsDB.setTelefono(Integer.parseInt(txtClienteTelefono.getText()));
                clsDB.setSaldo(Double.parseDouble(txtClienteSaldo.getText()));
                clsDB.setLimite_credito(Integer.parseInt(txtClienteCredito.getText()));
                clsDB.setDescuento(Double.parseDouble(txtClienteDescuento.getText()));
                clsDB.setNIT(txtClienteNIT.getText());
                cls.actualircliente(clsDB);
                cleanclientes();
                cleantable();                
                listacliente();
                JOptionPane.showMessageDialog(null, "articulo actualizado con exito");                
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ningun cliente");
            }
        }
    }//GEN-LAST:event_btnClienteActualizarActionPerformed

    private void btnLimpiarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarArticuloActionPerformed
        // TODO add your handling code here:
        cleanArticulos();
    }//GEN-LAST:event_btnLimpiarArticuloActionPerformed

    private void btnFabricaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabricaGuardarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtFabricaCodigo.getText()) || !"".equals(txtFabricaNombre.getText()) || !"".equals(txtFabricaTelefono.getText()) || !"".equals(txtFabricaDireccion.getText())){
            fabDB.setCodigo(txtFabricaCodigo.getText());
            fabDB.setNombre(txtFabricaNombre.getText());
            fabDB.setTelefono(Integer.parseInt(txtFabricaTelefono.getText()));
            fabDB.setDireccion(txtFabricaDireccion.getText());
            fab.registrofabricas(fabDB);
            cleantable();
            listfabricas();
            JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null, "llene los campos vacios");
        }
    }//GEN-LAST:event_btnFabricaGuardarActionPerformed

    private void btnFabricasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabricasActionPerformed
        // TODO add your handling code here:
        cleantable();
        listfabricas();
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnFabricasActionPerformed

    private void tblFabricasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFabricasMouseClicked
        // TODO add your handling code here:
        int fila = tblFabricas.rowAtPoint(evt.getPoint());
        txtFabricaCodigo.setText(tblFabricas.getValueAt(fila, 0).toString());
        txtFabricaNombre.setText(tblFabricas.getValueAt(fila, 1).toString());
        txtFabricaTelefono.setText(tblFabricas.getValueAt(fila, 2).toString());
        txtFabricaDireccion.setText(tblFabricas.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tblFabricasMouseClicked

    private void btnFabricaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabricaEliminarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtFabricaCodigo.getText())) {
            int question = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el producto");
            if (question == 0) {
                String codigo = txtFabricaCodigo.getText();
                fab.deletfabricas(codigo);
                cleantable();
                cleanFabricas();
                listfabricas();
            }
        }
    }//GEN-LAST:event_btnFabricaEliminarActionPerformed

    private void btnFabricaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabricaActualizarActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtFabricaCodigo.getText())) {
            JOptionPane.showConfirmDialog(null, "Tiene campos vacios");
        } else {
            if (!"".equals(txtFabricaCodigo.getText()) || !"".equals(txtFabricaNombre.getText()) || !"".equals(txtFabricaTelefono.getText()) || !"".equals(txtFabricaDireccion.getText()) || !"".equals(txtFabricaCodigo.getText())) {
                fabDB.setNombre(txtFabricaNombre.getText());
                fabDB.setTelefono(Integer.parseInt(txtFabricaTelefono.getText()));
                fabDB.setDireccion(txtFabricaDireccion.getText());
                fabDB.setCodigo(txtFabricaCodigo.getText());
                fab.actualizfabrica(fabDB);
                cleanFabricas();
                cleantable();                
                listfabricas();
                JOptionPane.showMessageDialog(null, "articulo actualizado con exito");                
            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ningun cliente");
            }
        }
    }//GEN-LAST:event_btnFabricaActualizarActionPerformed

    private void btnFabricaLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabricaLimpiarActionPerformed
        // TODO add your handling code here:
        cleanFabricas();
    }//GEN-LAST:event_btnFabricaLimpiarActionPerformed

    private void btnactualizarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarproveedorActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtProveedor_NIT.getText())) {
            JOptionPane.showConfirmDialog(null, "Seleccione un articulo");
        } else {
            if (!"".equals(txtProveedor_NIT.getText()) || !"".equals(txtProveedor_nombre.getText()) || !"".equals(txtProveedor_telefono.getText()) || !"".equals(txtProveedor_direccion.getText()) || !"".equals(cbxProveedorfabrica.getSelectedItem()) || !"".equals(txtProveedor_NIT.getText())) {
                proBD.setNIT(Integer.parseInt(txtProveedor_NIT.getText()));
                proBD.setNombre(txtProveedor_nombre.getText());                
                proBD.setTelefono(Integer.parseInt(txtProveedor_telefono.getText()));
                proBD.setDireccion(txtProveedor_direccion.getText());
                proBD.setFabrica(cbxProveedorfabrica.getSelectedItem().toString());
                proBD.setNIT(Integer.parseInt(txtProveedor_NIT.getText()));
                pro.actualizProveedor(proBD);
                cleantable();
                cleanProveedor();
                listaproveedor();
                JOptionPane.showMessageDialog(null, "articulo actualizado con exito");                
            }
        }
    }//GEN-LAST:event_btnactualizarproveedorActionPerformed

    private void tblProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedorMouseClicked
        // TODO add your handling code here:
        int fila = tblProveedor.rowAtPoint(evt.getPoint());
        txtProveedor_NIT.setText(tblProveedor.getValueAt(fila, 0).toString());
        txtProveedor_nombre.setText(tblProveedor.getValueAt(fila, 1).toString());
        txtProveedor_telefono.setText(tblProveedor.getValueAt(fila, 2).toString());
        txtProveedor_direccion.setText(tblProveedor.getValueAt(fila, 3).toString());        
        cbxProveedorfabrica.setSelectedItem(tblProveedor.getValueAt(fila, 5).toString());        
    }//GEN-LAST:event_tblProveedorMouseClicked

    private void btnlimpiarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarproveedorActionPerformed
        // TODO add your handling code here:
        cleanProveedor();
    }//GEN-LAST:event_btnlimpiarproveedorActionPerformed

    private void btnNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPedidoActionPerformed
        // TODO add your handling code here:
        cleantable();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnNuevoPedidoActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        // TODO add your handling code here:
        cleantable();
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        // TODO add your handling code here:
        cleantable();
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        cleantable();
        listUsuarios();
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnUsuarioGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioGuardarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtUsuarioNombre.getText()) || !"".equals(txtUsuarioCorreo.getText()) || !"".equals(PFUsuarioPassword.getText())){
            usuDB.setNombre(txtUsuarioNombre.getText());
            usuDB.setCorreo(txtUsuarioCorreo.getText());
            usuDB.setPassword(PFUsuarioPassword.getText());
            usu.registroUsuarios(usuDB);
            cleantable();
            listUsuarios();
            JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente");
        }else {
            JOptionPane.showMessageDialog(null, "llene los campos vacios");
        }
    }//GEN-LAST:event_btnUsuarioGuardarActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        // TODO add your handling code here:
        int fila = tblUsuario.rowAtPoint(evt.getPoint());
        txtUsuarioNombre.setText(tblUsuario.getValueAt(fila, 0).toString());
        txtUsuarioCorreo.setText(tblUsuario.getValueAt(fila, 1).toString());
        PFUsuarioPassword.setText(tblUsuario.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void btnUsuarioActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActualizarActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtUsuarioCorreo.getText())) {
            JOptionPane.showConfirmDialog(null, "Seleccione un articulo");
        } else {
            if (!"".equals(txtUsuarioNombre.getText()) || !"".equals(txtUsuarioCorreo.getText()) || !"".equals(PFUsuarioPassword.getText()) || !"".equals(txtUsuarioNombre.getText())) {
                usuDB.setCorreo(txtUsuarioNombre.getText());
                usuDB.setNombre(txtUsuarioCorreo.getText());                
                usuDB.setPassword(PFUsuarioPassword.getText());
                usuDB.setCorreo(txtUsuarioNombre.getText());
                usu.actualizarUsuarios(usuDB);
                cleantable();
                cleanUsuario();
                listUsuarios();
                JOptionPane.showMessageDialog(null, "articulo actualizado con exito");                
            }
        }
    }//GEN-LAST:event_btnUsuarioActualizarActionPerformed

    private void btnUsuarioLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioLimpiarActionPerformed
        // TODO add your handling code here:
        cleanUsuario();
    }//GEN-LAST:event_btnUsuarioLimpiarActionPerformed

    private void btnUsuarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioEliminarActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtUsuarioCorreo.getText())) {
            int question = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar el producto");
            if (question == 0) {
                String correo = txtUsuarioCorreo.getText();
                usu.deletUsuario(correo);
                cleantable();
                cleanUsuario();
                listUsuarios();
            }
        }
    }//GEN-LAST:event_btnUsuarioEliminarActionPerformed

    private void txtPedidoCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoCodigoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            if (!"".equals(txtPedidoCodigo.getText())) {
                String codigo = txtPedidoCodigo.getText();
                artDB = art.BusArticulos(codigo);
                if (artDB.getNombre() != null) {
                    txtPedidoNombre.setText(""+artDB.getNombre());
                    txtPedidoStock.setText(""+artDB.getIngresa());
                    txtPedidoPrecio.setText(""+artDB.getPrecio());
                    txtPedidoCantidad.requestFocus();
                }else{
                    CleanPedido();
                    txtPedidoCodigo.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Debe ingresar el codigo del articulo");
                txtPedidoCodigo.requestFocus();
            }
        }
    }//GEN-LAST:event_txtPedidoCodigoKeyPressed

    private void txtPedidoCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoCantidadKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtPedidoCantidad.getText())) {
                String codigo = txtPedidoCodigo.getText();
                String nombre = txtPedidoNombre.getText();
                int cantidad = Integer.parseInt(txtPedidoCantidad.getText());
                double precio = Double.parseDouble(txtPedidoPrecio.getText());
                double total = cantidad * precio;
                int stock = Integer.parseInt(txtPedidoStock.getText());
                if (stock >= cantidad) {
                    part = part + 1;
                    modelo = (DefaultTableModel) tblPedidoNuevo.getModel();
                    for (int i = 0; i < tblPedidoNuevo.getRowCount(); i++) {
                        if (tblPedidoNuevo.getValueAt(i, 1).equals(txtPedidoNombre.getText())) {
                            JOptionPane.showMessageDialog(null, "El articulo ya se encuentra registrado");
                            return;
                        }
                    }
                    ArrayList list = new ArrayList();
                    list.add(part);
                    list.add(codigo);
                    list.add(nombre);
                    list.add(cantidad);
                    list.add(precio);
                    list.add(total);
                    Object[] obj = new Object[5];
                    obj[0] = list.get(1);
                    obj[1] = list.get(2);
                    obj[2] = list.get(3);
                    obj[3] = list.get(4);
                    obj[4] = list.get(5);
                    modelo.addRow(obj);
                    tblPedidoNuevo.setModel(modelo);
                    CleanPedido();
                    Pagototalpedido();                    
                    txtPedidoCodigo.requestFocus();
                }else{
                    JOptionPane.showMessageDialog(null, "Stock insuficiente");
                }
            }else{
                    JOptionPane.showMessageDialog(null, "Cantidad no ingresada");
                }
            
        }
    }//GEN-LAST:event_txtPedidoCantidadKeyPressed

    private void btnPedidoEliminarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoEliminarArtActionPerformed
        // TODO add your handling code here:
        modelo = (DefaultTableModel) tblPedidoNuevo.getModel();
        modelo.removeRow(tblPedidoNuevo.getSelectedRow());
        Pagototalpedido();
        txtPedidoCodigo.requestFocus();
    }//GEN-LAST:event_btnPedidoEliminarArtActionPerformed

    private void txtPedidoNITClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoNITClienteKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(txtPedidoNITCliente.getText())) {
                String NIT = txtPedidoNITCliente.getText();
                clsDB = cls.BuscarClientess(NIT);
                if (clsDB.getNombre() != null) {
                    txtPedidoNomCliente.setText(""+clsDB.getNombre());
                    txtPedidoDirCliente.setText(""+clsDB.getDireccion_envio());
                    txtPedidoTelCliente.setText(""+clsDB.getTelefono());
                }else{
                    txtPedidoNomCliente.setText("");
                    JOptionPane.showMessageDialog(null, "Cliente incorrecto, ingrese un cliente valido");
                }
            }
        }
    }//GEN-LAST:event_txtPedidoNITClienteKeyPressed

    private void btnPedidoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoImprimirActionPerformed
        // TODO add your handling code here:
        Regpedido();
    }//GEN-LAST:event_btnPedidoImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxArticuloProveedor;
    private javax.swing.JPasswordField PFUsuarioPassword;
    private javax.swing.JButton btnActualizarArticulo;
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnClienteActualizar;
    private javax.swing.JButton btnClienteEliminar;
    private javax.swing.JButton btnClienteGuardar;
    private javax.swing.JButton btnClientelimpiar;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEliminarArticulo;
    private javax.swing.JButton btnFabricaActualizar;
    private javax.swing.JButton btnFabricaEliminar;
    private javax.swing.JButton btnFabricaGuardar;
    private javax.swing.JButton btnFabricaLimpiar;
    private javax.swing.JButton btnFabricas;
    private javax.swing.JButton btnGuardarArticulo;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnLimpiarArticulo;
    private javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton btnPedidoEliminarArt;
    private javax.swing.JButton btnPedidoImprimir;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnUsuarioActualizar;
    private javax.swing.JButton btnUsuarioEliminar;
    private javax.swing.JButton btnUsuarioGuardar;
    private javax.swing.JButton btnUsuarioLimpiar;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnactualizarproveedor;
    private javax.swing.JButton btneliminarproveedor;
    private javax.swing.JButton btnguardarproveedor;
    private javax.swing.JButton btnlimpiarproveedor;
    private javax.swing.JComboBox<String> cbxProveedorfabrica;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblPagoTotal;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTable tblArticulos;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblFabricas;
    private javax.swing.JTable tblPedidoNuevo;
    private javax.swing.JTable tblProveedor;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtArticuloCodigo;
    private javax.swing.JTextField txtArticuloDescrip;
    private javax.swing.JTextField txtArticuloIngresa;
    private javax.swing.JTextField txtArticuloNombre;
    private javax.swing.JTextField txtArticuloPrecio;
    private javax.swing.JTextField txtClienteCredito;
    private javax.swing.JTextField txtClienteDescuento;
    private javax.swing.JTextField txtClienteDireccion;
    private javax.swing.JTextField txtClienteNIT;
    private javax.swing.JTextField txtClienteNombre;
    private javax.swing.JTextField txtClienteSaldo;
    private javax.swing.JTextField txtClienteTelefono;
    private javax.swing.JTextField txtFabricaCodigo;
    private javax.swing.JTextField txtFabricaDireccion;
    private javax.swing.JTextField txtFabricaNombre;
    private javax.swing.JTextField txtFabricaTelefono;
    private javax.swing.JTextField txtPedidoCantidad;
    private javax.swing.JTextField txtPedidoCodigo;
    private javax.swing.JTextField txtPedidoDirCliente;
    private javax.swing.JTextField txtPedidoNITCliente;
    private javax.swing.JTextField txtPedidoNomCliente;
    private javax.swing.JTextField txtPedidoNombre;
    private javax.swing.JTextField txtPedidoPrecio;
    private javax.swing.JTextField txtPedidoStock;
    private javax.swing.JTextField txtPedidoTelCliente;
    private javax.swing.JTextField txtProveedor_NIT;
    private javax.swing.JTextField txtProveedor_direccion;
    private javax.swing.JTextField txtProveedor_nombre;
    private javax.swing.JTextField txtProveedor_telefono;
    private javax.swing.JTextField txtUsuarioCorreo;
    private javax.swing.JTextField txtUsuarioNombre;
    // End of variables declaration//GEN-END:variables

    private void cleanArticulos() {
        txtArticuloCodigo.setText("");
        txtArticuloNombre.setText("");
        CboxArticuloProveedor.setSelectedItem(null);
        txtArticuloIngresa.setText("");
        txtArticuloDescrip.setText("");
        txtArticuloPrecio.setText("");
    }
    
    private void cleanclientes() {
        txtClienteNIT.setText("");
        txtClienteNombre.setText("");
        txtClienteDireccion.setText("");
        txtClienteTelefono.setText("");
        txtClienteSaldo.setText("");
        txtClienteCredito.setText("");
        txtClienteDescuento.setText("");
    }

    private void cleanProveedor() {
        txtProveedor_NIT.setText("");
        txtProveedor_nombre.setText("");        
        txtProveedor_telefono.setText("");
        txtProveedor_direccion.setText("");
        CboxArticuloProveedor.setSelectedItem(null);
    }
    
    private void cleanFabricas() {
        txtFabricaCodigo.setText("");
        txtFabricaNombre.setText("");        
        txtFabricaTelefono.setText("");
        txtFabricaDireccion.setText("");
    }
    
    private void cleanUsuario() {
        txtUsuarioCorreo.setText("");
        txtUsuarioNombre.setText("");        
        PFUsuarioPassword.setText("");
    }
    
    private void Pagototalpedido(){
        cobrototal = 0.00;
        int filas = tblPedidoNuevo.getRowCount();
        for (int i = 0; i < filas; i++) {
            double calcular = Double.parseDouble(String.valueOf(tblPedidoNuevo.getModel().getValueAt(i, 3)));
            cobrototal = cobrototal + calcular;
        }
        lblPagoTotal.setText(String.format("%.2f", cobrototal));
    }
    
    private void CleanPedido(){
        txtPedidoCodigo.setText("");
        txtPedidoNombre.setText("");
        txtPedidoStock.setText("");
        txtPedidoPrecio.setText("");
        txtPedidoCantidad.setText("");
    }
    
    private void Regpedido(){
        String NIT = txtPedidoNITCliente.getText();
        String cliente = txtPedidoNomCliente.getText();        
        String usuario = lblusuario.getText();
        double total = cobrototal;
        peDB.setNIT_cliente(NIT);
        peDB.setNombre_cliente(cliente);
        peDB.setUsuario(usuario);
        peDB.setTotal(total);
        ped.registropedido(peDB);
    }
    
}
