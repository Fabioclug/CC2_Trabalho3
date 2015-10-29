/**
 */
package ufscar.compiladores2.musy.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ufscar.compiladores2.musy.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ufscar.compiladores2.musy.MusyPackage
 * @generated
 */
public class MusyAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MusyPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MusyAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MusyPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MusySwitch<Adapter> modelSwitch =
    new MusySwitch<Adapter>()
    {
      @Override
      public Adapter caseMidi(Midi object)
      {
        return createMidiAdapter();
      }
      @Override
      public Adapter caseMidiBody(MidiBody object)
      {
        return createMidiBodyAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseParameterBeat(ParameterBeat object)
      {
        return createParameterBeatAdapter();
      }
      @Override
      public Adapter caseParameterTimeSignature(ParameterTimeSignature object)
      {
        return createParameterTimeSignatureAdapter();
      }
      @Override
      public Adapter caseParameterTimeNote(ParameterTimeNote object)
      {
        return createParameterTimeNoteAdapter();
      }
      @Override
      public Adapter caseParameterTimePause(ParameterTimePause object)
      {
        return createParameterTimePauseAdapter();
      }
      @Override
      public Adapter caseParameterOctave(ParameterOctave object)
      {
        return createParameterOctaveAdapter();
      }
      @Override
      public Adapter caseDeclaredChord(DeclaredChord object)
      {
        return createDeclaredChordAdapter();
      }
      @Override
      public Adapter caseTrack(Track object)
      {
        return createTrackAdapter();
      }
      @Override
      public Adapter caseTrackBody(TrackBody object)
      {
        return createTrackBodyAdapter();
      }
      @Override
      public Adapter caseBodyComponent(BodyComponent object)
      {
        return createBodyComponentAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseTimeSignature(TimeSignature object)
      {
        return createTimeSignatureAdapter();
      }
      @Override
      public Adapter caseChordParams(ChordParams object)
      {
        return createChordParamsAdapter();
      }
      @Override
      public Adapter caseNote(Note object)
      {
        return createNoteAdapter();
      }
      @Override
      public Adapter caseCustomNoteParam(CustomNoteParam object)
      {
        return createCustomNoteParamAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Midi <em>Midi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Midi
   * @generated
   */
  public Adapter createMidiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.MidiBody <em>Midi Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.MidiBody
   * @generated
   */
  public Adapter createMidiBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.ParameterBeat <em>Parameter Beat</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.ParameterBeat
   * @generated
   */
  public Adapter createParameterBeatAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.ParameterTimeSignature <em>Parameter Time Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.ParameterTimeSignature
   * @generated
   */
  public Adapter createParameterTimeSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.ParameterTimeNote <em>Parameter Time Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.ParameterTimeNote
   * @generated
   */
  public Adapter createParameterTimeNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.ParameterTimePause <em>Parameter Time Pause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.ParameterTimePause
   * @generated
   */
  public Adapter createParameterTimePauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.ParameterOctave <em>Parameter Octave</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.ParameterOctave
   * @generated
   */
  public Adapter createParameterOctaveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.DeclaredChord <em>Declared Chord</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.DeclaredChord
   * @generated
   */
  public Adapter createDeclaredChordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Track <em>Track</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Track
   * @generated
   */
  public Adapter createTrackAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.TrackBody <em>Track Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.TrackBody
   * @generated
   */
  public Adapter createTrackBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.BodyComponent <em>Body Component</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.BodyComponent
   * @generated
   */
  public Adapter createBodyComponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.TimeSignature <em>Time Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.TimeSignature
   * @generated
   */
  public Adapter createTimeSignatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.ChordParams <em>Chord Params</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.ChordParams
   * @generated
   */
  public Adapter createChordParamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.Note
   * @generated
   */
  public Adapter createNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ufscar.compiladores2.musy.CustomNoteParam <em>Custom Note Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ufscar.compiladores2.musy.CustomNoteParam
   * @generated
   */
  public Adapter createCustomNoteParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MusyAdapterFactory
