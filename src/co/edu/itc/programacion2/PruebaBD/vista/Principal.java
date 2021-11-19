//package co.edu.itc.programacion2.PruebaBD.vista;
//
//import co.edu.itc.programacion2.PruebaBD.negocio.CandidatoDAO;
//import co.edu.itc.programacion2.PruebaBD.vo.CandidatoVO;
//import java.util.List;
//import java.util.Scanner;
//
//public class Principal {
//
//    private static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        CandidatoVO objRet = null;
//        CandidatoDAO objDao = new CandidatoDAO();
//        int seleccion;
//
//        boolean salida = false;
//        
//        while (salida != true) {
//
//            System.out.println("Seleccione la opcion que necesite");
//            System.out.println("1. Leer todos los candidatos inscritos");
//            System.out.println("2. Inscribir un candidato");
//            System.out.println("3. Buscar candidato por codigo");
//            System.out.println("4. Actualizar informacion del candidato");
//            System.out.println("5. Eliminar candidato de la base de datos");
//            System.out.println("6. Salir");
//            System.out.println("------------------------------------------------");
//            seleccion = Integer.parseInt(sc.nextLine());
//
//            switch (seleccion) {
//                case 1:
//                    // lee candidatos
//                    List<CandidatoVO> misCand = objDao.listarCandidatos();
//                    for (CandidatoVO e : misCand) {
//                        System.out.println("Codigo " + e.getCodigoCandidato());
//                        System.out.println("Nombre " + e.getNombre());
//                        System.out.println("Apellidos " + e.getApellidos());
//                        System.out.println("Nombre del acudiente " + e.getNombreAcudiente());
//                        System.out.println("Telefo del acudiente " + e.getTelefonoAcudiente());
//                        System.out.println("Grado a inscribirse " + e.getGradoAIngresar());
//                        System.out.println("------------------------------------------------");
//                    }
//                    System.out.println("------------------------------------------------");
//                    break;
//
//                case 2:
////                    Ingresar un cadidato 
//                    System.out.println("Ingresar Candidato");
//                    System.out.println("Digite el codigo del candidato");
//                    Integer cod = Integer.parseInt(sc.nextLine());
//                    System.out.println("Digite el nombre");
//                    String nom = sc.nextLine();
//                    System.out.println("Digite los apellidos");
//                    String apel = sc.nextLine();
//                    System.out.println("Digite el nombre del acudiente");
//                    String nomAcudi = sc.nextLine();
//                    System.out.println("Digite el telefono del acudiente");
//                    String telAcud = sc.nextLine();
//                    System.out.println("Digite el grado al que desea inscribirse");
//                    String grado = sc.nextLine();
//
//                    CandidatoVO objCand = new CandidatoVO(cod, nom, apel, nomAcudi, telAcud, grado);
//                    objRet = objDao.ingresarCandidato(objCand);
//
//                    if (objRet != null) {
//                        System.out.println("Guardado exitoso");
//                        System.out.println("------------------------------------------------");
//                        System.out.println("Lista de candidatos");
//                        System.out.println("------------------------------------------------");
//                        List<CandidatoVO> misCand2 = objDao.listarCandidatos();
//                        for (CandidatoVO e : misCand2) {
//                            System.out.println("Codigo " + e.getCodigoCandidato());
//                            System.out.println("Nombre " + e.getNombre());
//                            System.out.println("Apellidos " + e.getApellidos());
//                            System.out.println("Nombre del acudiente " + e.getNombreAcudiente());
//                            System.out.println("Telefo del acudiente " + e.getTelefonoAcudiente());
//                            System.out.println("Grado a inscribirse " + e.getGradoAIngresar());
//                            System.out.println("------------------------------------------------");
//                        }
//                    } else {
//                        System.out.println("Se presento un error");
//                    }
//                    System.out.println("------------------------------------------------");
//                    break;
//
//                case 3:
//
//                    System.out.println("Digite el código del candidato a buscar");
//                    int codigoCand = Integer.parseInt(sc.nextLine());
//                    CandidatoVO miCand3 = objDao.candidatoFindByCodigo(codigoCand);
//                    System.out.println("------------------------------------------------");
//                    System.out.println("Los datos recuperados son ");
//                    System.out.println("Codigo " + miCand3.getCodigoCandidato());
//                    System.out.println("Nombre " + miCand3.getNombre());
//                    System.out.println("Apellidos " + miCand3.getApellidos());
//                    System.out.println("Nombre del acudiente " + miCand3.getNombreAcudiente());
//                    System.out.println("Telefo del acudiente " + miCand3.getTelefonoAcudiente());
//                    System.out.println("Grado a inscribirse " + miCand3.getGradoAIngresar());
//                    System.out.println("------------------------------------------------");
//                    break;
//
//                case 4:
//                    // Actualizar informacion
//                    System.out.println("Digite el código del candidato que desea actualizar");
//                    int codigoCand4 = Integer.parseInt(sc.nextLine());
//
//                    CandidatoVO miCand4 = objDao.candidatoFindByCodigo(codigoCand4);
//                    System.out.println("El candidato que desea actualizar es: ");
//                    System.out.println("Codigo " + miCand4.getCodigoCandidato());
//                    System.out.println("Nombre " + miCand4.getNombre());
//                    System.out.println("Apellidos " + miCand4.getApellidos());
//                    System.out.println("Nombre del acudiente " + miCand4.getNombreAcudiente());
//                    System.out.println("Telefo del acudiente " + miCand4.getTelefonoAcudiente());
//                    System.out.println("Grado a inscribirse " + miCand4.getGradoAIngresar());
//                    System.out.println("------------------------------------------------");
//
//                    int seleccion2;
//                    boolean salida2 = false;
//                    while (salida2 != true) {
//
//                        System.out.println("Seleccione la opcion segun el campo que desee actualizar");
//                        System.out.println("1. Codigo del candidato");
//                        System.out.println("2. Nombre del candidato");
//                        System.out.println("3. Apellidos del candidato");
//                        System.out.println("4. Nombre del acudiente");
//                        System.out.println("5. Telefono del acudiente");
//                        System.out.println("6. Curso al cuan desea inscribirse");
//                        System.out.println("7. finalizar la actualizacion de datos");
//                        System.out.println("------------------------------------------------");
//                        seleccion2 = Integer.parseInt(sc.nextLine());
//                        switch (seleccion2) {
//
//                            case 1:
//                                System.out.println("Ingrese nuevo codigo");
//                                miCand4.setCodigoCandidato(sc.nextInt());
//                                break;
//                            case 2:
//                                System.out.println("Ingrese nuevo nombre");
//                                miCand4.setNombre(sc.nextLine());
//                                break;
//                            case 3:
//                                System.out.println("Ingrese nuevos apellidos");
//                                miCand4.setApellidos(sc.nextLine());
//                                break;
//                            case 4:
//                                System.out.println("Ingrese nuevo nombre de acudiente");
//                                miCand4.setNombreAcudiente(sc.nextLine());
//                                break;
//                            case 5:
//                                System.out.println("Ingrese nuevo telefono de acudiente");
//                                miCand4.setTelefonoAcudiente(sc.nextLine());
//                                break;
//                            case 6:
//                                System.out.println("Ingrese el curso al que aspira");
//                                miCand4.setGradoAIngresar(sc.nextLine());
//                                break;
//
//                            case 7:
//                                salida2 = true;
//                                System.out.println("Usted ha salido del menu de modificaciones");
//                                System.out.println("------------------------------------------------");
//                                break;
//
//                            default:
//                                System.out.println("Seleccione una opcion valida");
//                                System.out.println("------------------------------------------------");
//
//                        }
//                    }
//
//                    objDao.actualizarCandidato(miCand4);
//
//                    CandidatoVO miCandtAct = objDao.candidatoFindByCodigo(codigoCand4);
//                    System.out.println("--El estudiante actualizado quedo con los siguentes datos--");
//                    System.out.println("Codigo " + miCandtAct.getCodigoCandidato());
//                    System.out.println("Nombre " + miCandtAct.getNombre());
//                    System.out.println("Apellidos " + miCandtAct.getApellidos());
//                    System.out.println("Nombre del acudiente " + miCandtAct.getNombreAcudiente());
//                    System.out.println("Telefo del acudiente " + miCandtAct.getTelefonoAcudiente());
//                    System.out.println("Grado a inscribirse " + miCandtAct.getGradoAIngresar());
//
//                    System.out.println("------------------------------------------------");
//                    break;
//
//                case 5:
////                    Eliminar candidato
//                    System.out.println("Digite el código del candidato a eliminar");
//                    int codigoCand5 = Integer.parseInt(sc.nextLine());
//                    CandidatoVO miEst5 = objDao.candidatoFindByCodigo(codigoCand5);
//                    System.out.println("Los datos recuperados del candidato a eliminar son:  ");
//                    System.out.println("Codigo " + miEst5.getCodigoCandidato());
//                    System.out.println("Nombre " + miEst5.getNombre());
//                    System.out.println("Apellidos " + miEst5.getApellidos());
//                    System.out.println("Nombre del acudiente " + miEst5.getNombreAcudiente());
//                    System.out.println("Telefo del acudiente " + miEst5.getTelefonoAcudiente());
//                    System.out.println("Grado a inscribirse " + miEst5.getGradoAIngresar());
//
//                    System.out.println("------------------------------------------------");
//
//                    int seleccion3;
//                    boolean salida3 = false;
//                    while (salida3 != true) {
//
//                        System.out.println("¿Esta seguro que desea ELIMINAR el candidato?");
//                        System.out.println("1. SI");
//                        System.out.println("2. NO");
//                        seleccion3 = Integer.parseInt(sc.nextLine());
//                        switch (seleccion3) {
//
//                            case 1:
//                                objDao.eliminiarEstudiante(miEst5);
//                                System.out.println("El candidato ha sido eliminado de la base de datos  ");
//                                salida3=true;
//                                System.out.println("------------------------------------------------");
//                                break;
//
//                            case 2:
//                                System.out.println("No se elimino el candidato  ");
//                                salida3=true;
//                                System.out.println("------------------------------------------------");
//                                break;
//
//                            default:
//                                System.out.println("Seleccione una opcion valida");
//                                System.out.println("------------------------------------------------");
//                        }
//                    }
//                    break;
//                case 6:
//                    salida = true;
//                    System.out.println("Usted ha salido del menu");
//                    System.out.println("------------------------------------------------");
//                    break;
//
//                default:
//                    System.out.println("Seleccione una opcion valida");
//                    System.out.println("------------------------------------------------");
//            }
//
//        }
//    }
//
//}
